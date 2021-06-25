package model.display;

public class Forecast extends WeatherDisplay {

  public void displayInfo(){

    System.out.println("El dia " + "Lunes" + " el pronostico es: ");
    System.out.println(prediction() + "\n");

  }

  private String prediction(){
    if(super.values.getPressure() > super.values.getHumid() && super.values.getHumid() > super.values.getTemp()){return "lluvioso";}
    else if(super.values.getTemp() > super.values.getHumid()){return "soleado";}
    else{return "nublado";}
  }


}
