package observable_pattern;

public class CurrentConditionsDisplay implements  DisplayElement, Observer{

    private float temperature;

    private float humidity;

    //Needed if we want to un-register ourselves from the observable_pattern.Subject.
    private final Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        /** @registerObserver() is how this observer subscribes to the Subject*/
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
