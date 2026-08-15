public class Java_20260815_observer_WeatherStationMain {

    public static void main(String[] args) {

        Java_20260815_observer_WeatherData weatherData = new Java_20260815_observer_WeatherData();

        Java_20260815_observer_CurrentConditionsDisplay currentDisplay = new Java_20260815_observer_CurrentConditionsDisplay(weatherData);

        Java_20260815_observer_StatisticsDisplay statisticsDisplay = new Java_20260815_observer_StatisticsDisplay(weatherData);

        Java_20260815_observer_ForecastDisplay forecastDisplay = new Java_20260815_observer_ForecastDisplay(weatherData);

        weatherData.setMeasurements(80.0f, 65.0f, 30.4f);

        weatherData.setMeasurements(82.0f, 70.0f, 29.2f);

        weatherData.setMeasurements(78.0f, 90.0f, 29.2f);
    
    }

}

