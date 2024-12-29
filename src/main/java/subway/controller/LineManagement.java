package subway.controller;

import subway.util.Validator;
import subway.view.InputView;
import subway.view.OutputView;

import java.util.*;

import static subway.message.OutputMessage.*;

public class LineManagement {
    public static void run(Map<String, List<String>> lineRepo) {
        OutputView.printLineManagementMenu();
        String choice = inputHandler();
        if (Objects.equals(choice, "1")) addLine(lineRepo);
        if (Objects.equals(choice, "2")) deleteLine(lineRepo);
        if (Objects.equals(choice, "3")) lineInventory(lineRepo);
        if (Objects.equals(choice, "B")) MainController.run();
    }

    private static void addLine(Map<String, List<String>> lineRepo) {
        while (true) {
            try {
                String line = Validator.validateName(Validator.isAlreadyRegister(new ArrayList<>(lineRepo.keySet()), InputView.readAddLine()));
                lineRepo.put(line, Arrays.asList(InputView.readDepartStation(), InputView.readDestination()));
                OutputView.showInfoMessage(LINE_ADD.getMessage());
                break;
            } catch (IllegalArgumentException e) {
                OutputView.showErrorMessage(e.getMessage());
            }
        }
        MainController.run();
    }

    private static void deleteLine(Map<String, List<String>> lineRepo) {
        List<String> lines = new ArrayList<>(lineRepo.keySet());
        while (true) {
            try {
                String line = Validator.validateDelete(lines, InputView.readDeleteLine());
                Validator.isEmpty(lines);
                lineRepo.remove(line);
                OutputView.showInfoMessage(LINE_DELETE.getMessage());
                break;
            } catch (IllegalArgumentException e) {
                OutputView.showErrorMessage(e.getMessage());
            }
        }
        MainController.run();
    }

    private static void lineInventory(Map<String, List<String>> lineRepo) {
        List<String> lines = new ArrayList<>(lineRepo.keySet());
        OutputView.printInventory(lines);
        MainController.run();
    }

    private static String inputHandler() {
        while (true) {
            try {
                return Validator.validateStationManagementMenu(InputView.readUserChoice());
            } catch (IllegalArgumentException e) {
                OutputView.showErrorMessage(e.getMessage());
            }
        }
    }
}