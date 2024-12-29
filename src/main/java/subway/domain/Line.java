package subway.domain;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static subway.domain.Station.*;

public enum Line {
    LINE_2("2호선", List.of(STATION1.getName(), STATION2.getName(), STATION3.getName())),
    LINE_3("3호선", List.of(STATION1.getName(), STATION4.getName(), STATION5.getName(), STATION7.getName())),
    NEW_BUNDANG_LINE("신분당선", List.of(STATION1.getName(), STATION5.getName(), STATION6.getName()));

    private final String lineName;
    private final List<String> stations;

    Line(String lineName, List<String> stations) {
        this.lineName = lineName;
        this.stations = stations;
    }

    public String getLineName() {
        return lineName;
    }

    public List<String> getLineStation() {
        return stations;
    }

    public static Map<String, List<String>> getAllLineStation() {
        return Stream.of(values())
                .collect(Collectors.toMap(Line::getLineName, Line::getLineStation));
    }
}