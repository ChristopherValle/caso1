package model.display;


public class CurrentConditions extends WeatherDisplay {


    @Override
    public void displayInfo(){

        System.out.println("Fecha: 2/03/23"  );
        System.out.println("Temperatura:" + super.values.getTemp() +"\n");
        System.out.println("Humedad:" + super.values.getHumid() +"\n");
        System.out.println("Presion  Barometrica: "+ super.values.getPressure() +"\n");

    }

}
