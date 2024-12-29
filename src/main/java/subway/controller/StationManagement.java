package subway.controller;

import subway.domain.Station;
import subway.domain.StationRepository;
import subway.util.Validator;
import subway.view.InputView;
import subway.view.OutputView;

import java.util.Objects;

import static subway.message.OutputMessage.STATION_ADD;
import static subway.message.OutputMessage.STATION_DELETE;

public class StationManagement {
    private static final StationRepository stationRepository = new StationRepository(Station.getRegisterStations());

    public static void run() {
        OutputView.printStationManagementMenu();
        String choice = inputHandler();
        if (Objects.equals(choice, "1")) addStation();
        if (Objects.equals(choice, "2")) deleteStation();
        if (Objects.equals(choice, "3")) stationInventory();
        if (Objects.equals(choice, "B")) MainController.run();
    }

    private static void addStation() {
        while (true) {
            try {
                String station = Validator.isAlreadyRegister(stationRepository.getStations(), InputView.readAddStation());
                stationRepository.addStation(Validator.validateName(station));
                OutputView.showInfoMessage(STATION_ADD.getMessage());
                break;
            } catch (IllegalArgumentException e) {
                OutputView.showErrorMessage(e.getMessage());
            }
        }
        MainController.run();
    }

    private static void deleteStation() {
        while (true) {
            try {
                String station = Validator.validateDelete(stationRepository.getStations(), InputView.readDeleteStation());
                Validator.isAlreadyRegister(Station.getRegisterStations(), station);
                stationRepository.deleteStation(station);
                OutputView.showInfoMessage(STATION_DELETE.getMessage());
                break;
            } catch (IllegalArgumentException e) {
                OutputView.showErrorMessage(e.getMessage());
            }
        }
        MainController.run();
    }

    private static void stationInventory() {
        OutputView.printInventory(stationRepository.getStations());
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