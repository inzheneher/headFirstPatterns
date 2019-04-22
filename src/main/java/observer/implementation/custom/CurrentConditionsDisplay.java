package observer.implementation.custom;

import observer.implementation.custom.interfaces.DisplayElement;
import observer.implementation.custom.interfaces.Observer;
import observer.implementation.custom.interfaces.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println(
                "Current conditions: " +
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
