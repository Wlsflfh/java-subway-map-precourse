package subway.message;

public enum ExceptionMessage {
    INVALID_INPUT("선택할 수 없는 기능입니다."),
    RETRY_INPUT("잘못된 입력입니다."),
    ALREADY_REGISTER("이미 등록된 역, 라인 이름입니다."),
    INVALID_NAME("역, 라인 이름은 두 글자 이상이어야 합니다."),
    DO_NOT_DELETE("삭제할 수 없습니다"),
    DO_NOT_EXIST("라인이 존재하지않습니다.");

    public static final String BASE_MESSAGE = "\n[ERROR] %s 다시 입력해 주세요.";
    private final String message;

    ExceptionMessage(final String message)  {
        this.message = String.format(BASE_MESSAGE, message);
    }

    public String format() {
        return String.format(message);
    }
}