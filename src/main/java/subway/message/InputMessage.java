package subway.message;

public enum InputMessage {
    OPTION_MESSAGE("\n## 원하는 기능을 선택하세요."),
    ADD_STATION_MESSAGE("\n## 등록할 역 이름을 입력하세요."),
    DELETE_STATION_MESSAGE("\n## 삭제할 역 이름을 입력하세요."),
    ADD_LINE_MESSAGE("\n## 등록할 노선 이름을 입력하세요."),
    DELETE_LINE_MESSAGE("\n## 삭제할 노선 이름을 입력하세요."),
    DEPART_STATION_MESSAGE("\n## 등록할 노선의 상행 종점역 이름을 입력하세요."),
    DESTINATION_MESSAGE("\n## 등록할 노선의 하행 종점역 이름을 입력하세요."),
    SECTION_LINE_MESSAGE("\n## 노선을 입력하세요."),
    ASSERT_STATION_MESSAGE("\n## 역이름을 입력하세요."),
    ASSERT_ORDER_MESSAGE("\n## 순서를 입력하세요."),
    DELETE_LINE_SECTION_MESSAGE("\n## 삭제할 구간의 노선을 입력하세요."),
    DELETE_SECTION_MESSAGE("\n## 삭제할 구간의 역을 입력하세요.");

    private final String message;

    InputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}