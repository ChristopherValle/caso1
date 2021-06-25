package model.display;

import java.util.Observable;
import java.util.Observer;


public class Compensation implements Observer
{
    
    @Override
    public void update(Observable o, Object value) {
        double ammount = ((Double) value) * 0.33;
        System.out.println("Compensation: " + ammount);
        
    }

}