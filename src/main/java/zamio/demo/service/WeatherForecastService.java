package zamio.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import zamio.demo.service.WeatherForecast;

@Service
public class WeatherForecastService {
    private static final String API_KEY = "1a1ba0bd99e2136c0a8c39c70b7cf954";
    private  static final String API_URL = "http://api.openweathermap.org/data/2.5/weather";
    private final RestTemplate restTemplate;

    public WeatherForecastService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public WeatherForecast getWeatherForecast(String city) {
        String apiUrl = String.format(API_URL, "?id=", city, "&appid=", API_KEY);
        WeatherApiResponse response = restTemplate.getForObject(apiUrl, WeatherApiResponse.class);

        if (response != null) {
            WeatherApiResponse.Weather weather = response.getWeather()[0];
            WeatherApiResponse.Main main = response.getMain();

            WeatherForecast weatherForecast = new WeatherForecast();
            weatherForecast.setCity(response.getName());
            weatherForecast.setDescription(weather.getDescription());
            weatherForecast.setTemperature(main.getTemp() - 273.15);
            //TODO humidity, max temp, min...

            return weatherForecast;
        }

        return null;
    }
}

