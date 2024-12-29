package subway.message;

public enum OutputMessage {
    MAIN_MENU("\n## 메인 화면\n1. 역 관리\n2. 노선 관리\n3. 구간 관리\n4. 지하철 노선도 출력\nQ. 종료"),
    STATION_MANAGEMENT("\n## 역 관리 화면\n1. 역 등록\n2. 역 삭제\n3. 역 조회\nB. 돌아가기"),
    INFO_FORMAT("\n[INFO] %s\n"),
    PRINT_FORMAT("[INFO] %s\n"),
    STATION_ADD("지하철 역이 등록되었습니다.\n"),
    STATION_DELETE("지하철 역이 삭제되었습니다.\n"),
    STATION_INVENTORY("\n## 역 목록"),
    LINE_MANAGEMENT("\n## 노선 관리 화면\n1. 노선 등록\n2. 노선 삭제\n3. 노선 조회\nB. 돌아가기"),
    LINE_ADD("지하철 노선이 등록되었습니다.\n"),
    LINE_DELETE("지하철 노선이 삭제되었습니다.\n"),
    SECTION_MANAGEMENT("\n## 구간 관리 화면\n1. 구간 등록\n2. 구간 삭제\nB. 돌아가기"),
    SECTION_ADD("구간이 등록되었습니다.\n"),
    SECTION_DELETE("구간이 삭제되었습니다.\n"),
    DELIMITER("---");

    private final String message;

    OutputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}