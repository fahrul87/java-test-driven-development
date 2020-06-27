package fahrul.java.tdd;

import java.util.HashMap;
import java.util.Map;

public class PopulationSearch {
	
	public int getPopulation(String city) {
		Map<String, Integer> populationMap = null;
		int populationCount = 0;
		if (city.isEmpty()) {
			throw new NullPointerException("input shouldn't be empty");
		}
		populationMap = getPopulationStatistic();
		if (!populationMap.containsKey(city)) {
			throw new NullPointerException("invalid input");
		} else {
			populationCount = populationMap.get(city);
		}
		return populationCount;
	}
	// user can give empty input
	// input may not be present in db

	private Map<String, Integer> getPopulationStatistic() {
		Map<String, Integer> populationMap = new HashMap<>();
		populationMap.put("Malang", 200000);
		populationMap.put("Surabaya", 500000);
		populationMap.put("Jogja", 300000);
		populationMap.put("Semarang", 800000);
		return populationMap;
	}
}
