package model.display;

import java.util.Observable;

//esta es la clase que permite crear hibridos agregandole observadores
public class WeatherDataUpdater extends Observable {


    public void updateValue(double tem, double hum, double press) {
        Values val = new Values(tem,hum,press);
        setChanged();
        notifyObservers(val);


    }
}
