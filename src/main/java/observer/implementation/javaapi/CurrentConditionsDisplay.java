package observer.implementation.javaapi;

import observer.implementation.custom.interfaces.DisplayElement;
import org.springframework.stereotype.Component;

import java.util.Observable;
import java.util.Observer;

@Component
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println(
                "Current condition: " +
                        temperature + "C degrees and " +
                        humidity + "% humidity");
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }
}
