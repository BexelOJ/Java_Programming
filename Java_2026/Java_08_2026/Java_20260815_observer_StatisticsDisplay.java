public class Java_20260815_observer_StatisticsDisplay
        implements Java_20260815_observer_Observer, Java_20260815_observer_DisplayElement {

    private float maxTemp = 0.0f;
    private float minTemp = 200.0f;
    private float tempSum = 0.0f;
    private int numReadings;

    public Java_20260815_observer_StatisticsDisplay(Java_20260815_observer_Subject weatherData) {

        weatherData.registerObserver(this);

    }

    @Override
    public void update(float temperature, float humidity, float pressure) {

        tempSum += temperature;
        numReadings++;

        if (temperature > maxTemp) {
            maxTemp = temperature;
        }

        if (temperature < minTemp) {
            minTemp = temperature;
        }

        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }
}

