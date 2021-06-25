package model.display;

import java.util.Observable;

//esta es la clase que permite crear hibridos agregandole observadores
public class WeatherDataUpdater extends Observable {
    int id;

    public WeatherDataUpdater(int id){ this.id = id;}


    public void updateValue(double tem, double hum, double press) {
        System.out.println("Dispositivo: " + id + "\n");
        Values val = new Values(tem,hum,press);
        setChanged();
        notifyObservers(val);

    }
}
