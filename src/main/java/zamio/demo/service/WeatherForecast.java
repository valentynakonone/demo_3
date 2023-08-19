package zamio.demo.service;

import lombok.Data;

@Data
public class WeatherForecast {
    private String city;
    private String description;
    private double temperature;
    private double humidity;
}
