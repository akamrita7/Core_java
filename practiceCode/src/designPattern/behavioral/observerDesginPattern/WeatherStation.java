package designPattern.behavioral.observerDesginPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private List<Observers> observer = new ArrayList<>();
    private String weather;

    @Override
    public void addObserver(Observers observers) {
        observer.add(observers);
    }

    @Override
    public void removeObserver(Observers observers) {
        observer.remove(observers);
    }

    @Override
    public void notifyObserver() {
        for (Observers ob : observer){
            ob.update(weather);
        }

    }

    public void setWeather(String weather){
        this.weather = weather;
        notifyObserver();
    }
}
