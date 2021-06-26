package observable_pattern.custom_impl;

public class CurrentConditionsDisplay implements  DisplayElement, Observer{

    private float temperature;

    private float humidity;

    //Needed if we want to un-register ourselves from the observable_pattern.custom_impl.Subject.
    private final Subject weatherData;


    /** @param weatherData is used to subscribe observer to the Subject*/
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Temp:" + temperature + " Humidity:" + humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
