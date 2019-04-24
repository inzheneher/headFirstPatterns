package observer.implementation.javaapi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        classes = {observer.implementation.javaapi.ContextConfiguration.class})
public class WeatherDataTest {

    private WeatherData weatherData;
    private CurrentConditionsDisplay currentConditionsDisplay;

    @Autowired
    public void setWeatherData(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Autowired
    public void setCurrentConditionsDisplay(CurrentConditionsDisplay currentConditionsDisplay) {
        this.currentConditionsDisplay = currentConditionsDisplay;
    }

    @Test
    public void shouldPrintCurrentMeasurements() {
        weatherData.setMeasurements(80, 65, 30.4f);
        assertEquals(80, currentConditionsDisplay.getTemperature(), 0);
        weatherData.setMeasurements(82, 70, 29.2f);
        assertEquals(82, currentConditionsDisplay.getTemperature(), 0);
        weatherData.setMeasurements(78, 90, 29.2f);
        assertEquals(78, currentConditionsDisplay.getTemperature(), 0);
    }
}
