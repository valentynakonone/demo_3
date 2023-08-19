package zamio.demo.service;

import lombok.Data;

@Data
public class WeatherResponse {
    private Weather[] weather;
    private Main main;
    private String name;

    @Data
    static class Weather {
        private String main;
        private String description;
    }

    @Data
    static class Main {
        private double temp;
        private double feelsLike;
        private double tempMin;
        private double tempMax;
        private int pressure;
        private int seaLevel;
        private int humidity;
        private double tempKf;
    }
}

