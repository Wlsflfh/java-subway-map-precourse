package subway.view;

import java.util.Scanner;

import static subway.message.InputMessage.*;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static String readUserChoice() {
        System.out.println(OPTION_MESSAGE.getMessage());
        return scanner.nextLine();
    }

    public static String readAddStation() {
        System.out.println(ADD_STATION_MESSAGE.getMessage());
        return scanner.nextLine();
    }

    public static String readDeleteStation() {
        System.out.println(DELETE_STATION_MESSAGE.getMessage());
        return scanner.nextLine();
    }

    public static String readAddLine() {
        System.out.println(ADD_LINE_MESSAGE.getMessage());
        return scanner.nextLine();
    }

    public static String readDepartStation() {
        System.out.println(DEPART_STATION_MESSAGE.getMessage());
        return scanner.nextLine();
    }

    public static String readDestination() {
        System.out.println(DESTINATION_MESSAGE.getMessage());
        return scanner.nextLine();
    }

    public static String readDeleteLine() {
        System.out.println(DELETE_LINE_MESSAGE.getMessage());
        return scanner.nextLine();
    }

    public static String readSectionLine() {
        System.out.println(SECTION_LINE_MESSAGE.getMessage());
        return scanner.nextLine();
    }

    public static String readAssertStation() {
        System.out.println(ASSERT_STATION_MESSAGE.getMessage());
        return scanner.nextLine();
    }

    public static String readAssertOrder() {
        System.out.println(ASSERT_ORDER_MESSAGE.getMessage());
        return scanner.nextLine();
    }

    public static String readDeleteLineSection() {
        System.out.println(DELETE_LINE_SECTION_MESSAGE.getMessage());
        return scanner.nextLine();
    }

    public static String readDeleteSection() {
        System.out.println(DELETE_SECTION_MESSAGE.getMessage());
        return scanner.nextLine();
    }
}