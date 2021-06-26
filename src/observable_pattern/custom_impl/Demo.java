package observable_pattern.custom_impl;

public class Demo {


    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.registerObserver(currentConditionsDisplay);

        //DATA VALUES have changed which updates it to observers
        weatherData.setMeasurements(1.2f, .2f, .4f);
        weatherData.setMeasurements(4.2f, .0953f, .999f);





    }


}
