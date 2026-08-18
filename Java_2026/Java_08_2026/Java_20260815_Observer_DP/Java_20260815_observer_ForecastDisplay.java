public class Java_20260815_observer_ForecastDisplay
        implements Java_20260815_observer_Observer, Java_20260815_observer_DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;

    public Java_20260815_observer_ForecastDisplay(Java_20260815_observer_Subject weatherData) {

        weatherData.registerObserver(this);

    }

    @Override
    public void update(float temperature, float humidity, float pressure) {

        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }

    @Override
    public void display() {

        if (currentPressure > lastPressure) {
            System.out.println("Forecast: Improving weather on the way\n");
        } 
        else if (currentPressure < lastPressure) {
            System.out.println("Forecast: Watch out for cooler, rainy weather\n");
        } 
        else 
        {
            System.out.println("Forecast: More of the same\n");
        }

    }

}

