package DesignPattern.Observer.Weather;

public class ForecastDisplay implements Observer, DisplayElement{
    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.print("현재 날씨 : ");
        if(currentPressure > lastPressure){
            System.out.println("상승");
        }
        else if(currentPressure == lastPressure){
            System.out.println("동등");
        }else if(currentPressure < lastPressure){
            System.out.println("하락");
        }
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }
}
