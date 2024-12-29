package subway.domain;

import java.util.ArrayList;
import java.util.List;

public enum Station {
    STATION1("교대역"),
    STATION2("강남역"),
    STATION3("역삼역"),
    STATION4("남부터미널역"),
    STATION5("양재역"),
    STATION6("양재시민의숲역"),
    STATION7("매봉역");

    private final String station;

    Station(String station) {
        this.station = station;
    }

    public String getName() {
        return station;
    }

    public String getRegisterStation() {
        return station;
    }

    public static List<String> getRegisterStations() {
        List<String> stationList = new ArrayList<>();
        for (Station station : Station.values()) {
            stationList.add(station.getRegisterStation());
        }
        return stationList;
    }
}