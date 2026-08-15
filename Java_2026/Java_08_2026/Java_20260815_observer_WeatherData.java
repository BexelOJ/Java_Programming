import java.util.ArrayList;
import java.util.List;

public class Java_20260815_observer_WeatherData implements Java_20260815_observer_Subject {

    private List<Java_20260815_observer_Observer> observers;

    private float temperature;
    private float humidity;
    private float pressure;

    public Java_20260815_observer_WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Java_20260815_observer_Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Java_20260815_observer_Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Java_20260815_observer_Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }

    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }

}



