package subway.view;

import java.util.List;
import java.util.Map;

import static subway.message.OutputMessage.*;

public class OutputView {

    public static void printMainMenu() {
        System.out.println(MAIN_MENU.getMessage());
    }

    public static void printStationManagementMenu() {
        System.out.println(STATION_MANAGEMENT.getMessage());
    }

    public static void showInfoMessage(String message) {
        System.out.printf(INFO_FORMAT.getMessage(), message);
    }

    public static void printInventory(List<String> stations) {
        System.out.println(STATION_INVENTORY.getMessage());
        for (String station : stations) {
            System.out.printf(PRINT_FORMAT.getMessage(), station);
        }
    }

    public static void printLineManagementMenu() {
        System.out.println(LINE_MANAGEMENT.getMessage());
    }

    public static void printSectionManagementMenu() {
        System.out.println(SECTION_MANAGEMENT.getMessage());
    }

    public static void printSubwayMap(Map<String, List<String>> lineRepo) {
        for (String line : lineRepo.keySet()) {
            System.out.printf(PRINT_FORMAT.getMessage() + PRINT_FORMAT.getMessage(), line, DELIMITER.getMessage());
            for (String station : lineRepo.get(line)) {
                System.out.printf(PRINT_FORMAT.getMessage(), station);
            }
            System.out.println();
        }
    }

    public static void showErrorMessage(String errorMessage) {
        System.out.println(errorMessage);
    }
}