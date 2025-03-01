package observerDesginPattern;

public class Weather {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        Observers phone = new Phone();
        Observers tv = new Tv();
        station.addObserver(phone);
        station.addObserver(tv);
        station.setWeather("Too hot");
    }
}
