package model.display;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class WeatherStats extends WeatherDisplay{

    @Override
    public void displayInfo(){

        System.out.println("Con una temperatura de " + super.values.getTemp() + " grados y una humedad de " + super.values.getHumid());
        System.out.println("los siguientes dias podrian tener una temperatura de:" + BigDecimal.valueOf( futureTemp() ).setScale(1, RoundingMode.HALF_UP)+ "\n" );

    }
    public double futureTemp(){
        return (super.values.getTemp() + super.values.getHumid()) / 1.5;
    }


}
