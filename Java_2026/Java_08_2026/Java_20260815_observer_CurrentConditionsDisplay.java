public class Java_20260815_observer_CurrentConditionsDisplay
        implements Java_20260815_observer_Observer, Java_20260815_observer_DisplayElement {

    private float temperature;
    private float humidity;

    public Java_20260815_observer_CurrentConditionsDisplay(Java_20260815_observer_Subject weatherData) {

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
        System.out.println("Current conditions: \n" + temperature + "F degrees and \n" + humidity + "% humidity\n");
    }

}

