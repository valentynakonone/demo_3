package zamio.demo.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CitySelectionService {
    private final Map<Integer, CityInfo> cityOptions = new HashMap<>();

    public CitySelectionService() {
        cityOptions.put(1, new CityInfo("Kyiv, UA", "703448"));
        cityOptions.put(2, new CityInfo("Mykolaiv, UA", "700568"));
        cityOptions.put(3, new CityInfo("Zaporizhia, UA", "687700"));
        cityOptions.put(4, new CityInfo("Kharkiv, UA", "706483"));
        cityOptions.put(5, new CityInfo("Dnipro, UA", "709930"));
        cityOptions.put(6, new CityInfo("Lviv, UA", "702550"));


        cityOptions.put(7, new CityInfo("Warsaw, PL", "756135"));
        cityOptions.put(8, new CityInfo("Krakow, PL", "3094802"));
        cityOptions.put(9, new CityInfo("Wroclaw, PL", "3081368"));
        cityOptions.put(10, new CityInfo("Gdansk, PL", "3099434"));
        cityOptions.put(11, new CityInfo("Katowice, PL", "3096472"));
        cityOptions.put(12, new CityInfo("Poznan, PL", "3088171"));
    }

    public void displayCityOptions() {
        for (Map.Entry<Integer, CityInfo> entry : cityOptions.entrySet()) {
            CityInfo cityInfo = entry.getValue();
            System.out.println(entry.getKey() + " - " + cityInfo.getName());
        }
    }

    public CityInfo getCityInfo(int choice) {
        return cityOptions.get(choice);
    }
}





