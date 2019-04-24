package observer.implementation.javaapi;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean(name = "weatherData")
    public WeatherData weatherData() {
        return new WeatherData();
    }

    @Bean
    public CurrentConditionsDisplay currentConditionsDisplay(
            @Qualifier("weatherData") WeatherData weatherData) {
        return new CurrentConditionsDisplay(weatherData);
    }
}
