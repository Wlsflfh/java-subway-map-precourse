package subway.controller;

import subway.util.Validator;
import subway.view.InputView;
import subway.view.OutputView;

import java.util.*;

import static subway.message.OutputMessage.*;

public class SectionManagement {
    public static void run(Map<String, List<String>> lineRepo) {
        OutputView.printSectionManagementMenu();
        String choice = inputHandler();
        if (Objects.equals(choice, "1")) addSection(lineRepo);
        if (Objects.equals(choice, "2")) deleteSection(lineRepo);
        if (Objects.equals(choice, "B")) MainController.run();
    }

    private static void addSection(Map<String, List<String>> lineRepo) {
        while (true) {
            try {
                String line = Validator.isExist(new ArrayList<>(lineRepo.keySet()), InputView.readSectionLine());
                List<String> stations = new ArrayList<>(lineRepo.get(line));
                String station = Validator.isAlreadyRegister(stations, InputView.readAssertStation());
                int order = Validator.validateOrder(stations.size(), Validator.isNumeric(InputView.readAssertOrder()));
                stations.add(order, station);
                lineRepo.put(line, stations);
                OutputView.showInfoMessage(SECTION_ADD.getMessage());
                break;
            } catch (IllegalArgumentException e) {
                OutputView.showErrorMessage(e.getMessage());
            }
        }
        MainController.run();
    }

    private static void deleteSection(Map<String, List<String>> lineRepo) {
        while (true) {
            try {
                String line = Validator.validateDelete(new ArrayList<>(lineRepo.keySet()), InputView.readDeleteLineSection());
                List<String> stations = new ArrayList<>(lineRepo.get(line));
                String station = Validator.validateDelete(stations, InputView.readDeleteSection());
                Validator.validateDeleteSection(stations.size());
                stations.remove(station);
                lineRepo.put(line, stations);
                OutputView.showInfoMessage(SECTION_DELETE.getMessage());
                break;
            } catch (IllegalArgumentException e) {
                OutputView.showErrorMessage(e.getMessage());
            }
        }
        MainController.run();
    }

    private static String inputHandler() {
        while (true) {
            try {
                return Validator.validateSectionManagementMenu(InputView.readUserChoice());
            } catch (IllegalArgumentException e) {
                OutputView.showErrorMessage(e.getMessage());
            }
        }
    }
}