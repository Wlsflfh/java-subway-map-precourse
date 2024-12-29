package subway.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LineRepository {
    private final Map<String, List<String>> lineRepository = new HashMap<>();

    public LineRepository( Map<String, List<String>> allLineStation) {
        lineRepository.putAll(allLineStation);
    }

    public void addLine(String lineName, List<String> stations) {
        lineRepository.put(lineName, stations);
    }

    public Map<String, List<String>> getLineRepository() {
        return lineRepository;
    }
}