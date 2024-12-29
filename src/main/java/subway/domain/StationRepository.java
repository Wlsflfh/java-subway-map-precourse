package subway.domain;

import java.util.ArrayList;
import java.util.List;

public class StationRepository {
    private final List<String> stations = new ArrayList<>();

    public StationRepository(List<String> stationList) {
        stations.addAll(stationList);
    }

    public void addStation(String station) {
        stations.add(station);
    }

    public void deleteStation(String station) {
        stations.remove(station);
    }

    public List<String> getStations() {
        return stations;
    }
}