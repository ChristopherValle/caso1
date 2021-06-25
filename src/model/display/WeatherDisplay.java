package model.display;
import model.Values;
import java.util.Observable;
import java.util.Observer;

public class WeatherDisplay implements Observer {
    Values values;

    public void displayInfo(){System.out.println("Set a display model\n");}

    @Override
    public void update(Observable o, Object arg) {
        StringBuilder ss = new StringBuilder();
        values = (Values)arg;
        displayInfo();
    }
}
