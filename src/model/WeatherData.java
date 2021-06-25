package model;
import model.display.WeatherDataUpdater;

import java.util.*;


public class WeatherData  extends Observable{

    public List<WeatherDataUpdater> devices;

    public void addUpdater(WeatherDataUpdater w){
        devices.add(w);
    }
    public void removeUpdater(int i){
        devices.remove(i);
    }

    public void updateValue(double tem, double hum, double press) {
        for (WeatherDataUpdater device : devices) {
            device.updateValue(tem,hum,press);
        }
    }
}
