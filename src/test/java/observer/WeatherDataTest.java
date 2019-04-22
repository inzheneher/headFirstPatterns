package observer;

import observer.implementation.custom.CurrentConditionsDisplay;
import observer.implementation.custom.WeatherData;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeatherDataTest {

    private WeatherData weatherData;
    private CurrentConditionsDisplay currentConditionsDisplay;

    @Before
    public void setUp() {
        weatherData = new WeatherData();
        currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
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
