package subway.util;

import java.util.List;

import static subway.message.ExceptionMessage.*;

public class Validator {
    private final static String MAIN_INPUT_REGEX = "[1234Q]";
    private final static String STATION_INPUT_REGEX = "[123B]";
    private final static String SECTION_INPUT_REGEX = "[12B]";

    public static String validateMainMenu(String inputDate) {
        if (!inputDate.trim().matches(MAIN_INPUT_REGEX)) {
            throw new IllegalArgumentException(INVALID_INPUT.format());
        }
        return inputDate;
    }

    public static String validateStationManagementMenu(String inputDate) {
        if (!inputDate.trim().matches(STATION_INPUT_REGEX)) {
            throw new IllegalArgumentException(INVALID_INPUT.format());
        }
        return inputDate;
    }

    public static String validateSectionManagementMenu(String inputDate) {
        if (!inputDate.trim().matches(SECTION_INPUT_REGEX)) {
            throw new IllegalArgumentException(INVALID_INPUT.format());
        }
        return inputDate;
    }

    public static String isAlreadyRegister(List<String> stations, String station) {
        if (stations.contains(station)) {
            throw new IllegalArgumentException(ALREADY_REGISTER.format());
        }
        return station;
    }

    public static String isExist(List<String> stations, String station) {
        if (!stations.contains(station)) {
            throw new IllegalArgumentException(DO_NOT_EXIST.format());
        }
        return station;
    }

    public static String validateName(String name) {
        if (name.length() < 2) {
            throw new IllegalArgumentException(INVALID_NAME.format());
        }
        return name;
    }

    public static String validateDelete(List<String> stations, String station) {
        if (!stations.contains(station)) {
            throw new IllegalArgumentException(DO_NOT_DELETE.format());
        }
        return station;
    }

    public static void isEmpty(List<String> lines) {
        if (lines.isEmpty()) {
            throw new IllegalArgumentException(DO_NOT_DELETE.format());
        }
    }

    public static int validateOrder(int size, int order) {
        if (order > size) {
            return size;
        }
        if (order <= 0) {
            throw new IllegalArgumentException(RETRY_INPUT.format());
        }
        return order - 1;
    }

    public static int isNumeric(String order) {
        if (!order.matches("^-?\\d+$")) {
            throw new IllegalArgumentException(RETRY_INPUT.format());
        }
        return Integer.parseInt(order);
    }

    public static void validateDeleteSection(int size) {
        if (size < 3) {
            throw new IllegalArgumentException(DO_NOT_DELETE.format());
        }
    }
}