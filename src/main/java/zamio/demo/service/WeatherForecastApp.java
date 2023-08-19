package zamio.demo.service;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import zamio.demo.controller.ConsoleRunner;



import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })



public class WeatherForecastApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(WeatherForecastApp.class, args);

		ConsoleRunner consoleRunner = context.getBean(ConsoleRunner.class);
		consoleRunner.run();


		context.close();
	}
}









