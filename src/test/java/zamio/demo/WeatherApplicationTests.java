package zamio.demo;

import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.web.client.RestTemplate;
import zamio.demo.service.WeatherApiResponse;
import zamio.demo.service.WeatherForecastService;
import zamio.demo.service.WeatherForecast;

import static org.mockito.Mockito.when;

class WeatherApplicationTests {

	private WeatherForecastService weatherForecastService;

	@Mock
	private RestTemplate restTemplate;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
		weatherForecastService = new WeatherForecastService(restTemplate);
	}

	@Test
	void testGetWeatherForecast() {
		String cityId = "700568";
		WeatherApiResponse apiResponse = new WeatherApiResponse();


		when(restTemplate.getForObject(
				"http://api.openweathermap.org/data/2.5/weather?id=123&appid=1a1ba0bd99e2136c0a8c39c70b7cf954",
				WeatherApiResponse.class))
				.thenReturn(apiResponse);

		zamio.demo.service.WeatherForecast weatherForecast = weatherForecastService.getWeatherForecast(cityId);

	}
}

