package zamio.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import zamio.demo.service.CityInfo;
import zamio.demo.service.CitySelectionService;
import zamio.demo.service.WeatherForecast;
import zamio.demo.service.WeatherForecastService;

import java.util.Scanner;

@Component
public class ConsoleController {
    private final WeatherForecastService weatherForecastService;
    private final CitySelectionService citySelectionService;

    @Autowired
    public ConsoleController(WeatherForecastService weatherForecastService, CitySelectionService citySelectionService) {
        this.weatherForecastService = weatherForecastService;
        this.citySelectionService = citySelectionService;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a city:");
        citySelectionService.displayCityOptions();

        int choice = scanner.nextInt();
        CityInfo selectedCityInfo = citySelectionService.getCityInfo(choice);

        WeatherForecast weatherForecast = weatherForecastService.getWeatherForecast(selectedCityInfo.getCityId());
        if (weatherForecast != null) {
            System.out.println("Weather Forecast for " + selectedCityInfo.getName());
            System.out.println("Description: " + weatherForecast.getDescription());
            System.out.println("Temperature: " + weatherForecast.getTemperature() + " °C");
            System.out.println("Humidity: " + weatherForecast.getHumidity() + "%");
            //            System.out.println("Forecast: " + ...());
        } else {
            System.out.println("Failed to retrieve weather forecast.");
        }
    }
}
