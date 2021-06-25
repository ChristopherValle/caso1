package model.display;

import model.Values;

import java.util.Observable;

public class WeatherDataUpdater extends Observable {


    public void updateValue(double tem, double hum, double press) {
        Values val = new Values(tem,hum,press);
        setChanged();
        notifyObservers(val);


    }
}
