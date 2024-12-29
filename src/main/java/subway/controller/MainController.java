package subway.controller;

import subway.domain.Line;
import subway.domain.LineRepository;
import subway.util.Validator;
import subway.view.InputView;
import subway.view.OutputView;

import java.util.Objects;

public class MainController {
    private static final LineRepository lines = new LineRepository(Line.getAllLineStation());

    public static void run() {
        OutputView.printMainMenu();
        String choice = inputHandler();
        if (Objects.equals(choice, "1")) StationManagement.run();
        if (Objects.equals(choice, "2")) LineManagement.run(lines.getLineRepository());
        if (Objects.equals(choice, "3")) SectionManagement.run(lines.getLineRepository());
        if (Objects.equals(choice, "4")) {
            OutputView.printSubwayMap(lines.getLineRepository());
            run();
        }
        if (Objects.equals(choice, "Q")) return;
    }

    private static String inputHandler() {
        while (true) {
            try {
                return Validator.validateMainMenu(InputView.readUserChoice());
            } catch (IllegalArgumentException e) {
                OutputView.showErrorMessage(e.getMessage());
            }
        }
    }
}