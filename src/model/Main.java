package model;

import model.display.*;

public class Main {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

            WeatherDataUpdater device1 = new WeatherDataUpdater(1);
                WeatherDisplay fo1 = new Forecast();
            device1.addObserver(fo1);

            WeatherDataUpdater device2 = new WeatherDataUpdater(2);
                WeatherDisplay cc2 = new CurrentConditions();
            device2.addObserver(cc2);

            WeatherDataUpdater device3 = new WeatherDataUpdater(3);
                WeatherDisplay ws3 = new WeatherStats();
            device3.addObserver(ws3);

        weatherData.addUpdater(device1);
        weatherData.addUpdater(device2);
        weatherData.addUpdater(device3);


        // ---------Test---------
        System.out.println("--------Primer set--------");
        weatherData.updateValue(15,20,19);

        System.out.println("Press Any Key To Continue...");
        new java.util.Scanner(System.in).nextLine();
        // ---------Test---------
        WeatherDataUpdater device4 = new WeatherDataUpdater(1);
        WeatherDisplay cc1 = new CurrentConditions();
        device4.addObserver(fo1);
        device4.addObserver(cc1);

        WeatherDataUpdater device5 = new WeatherDataUpdater(2);
        WeatherDisplay ws2 = new WeatherStats();
        device5.addObserver(cc2);
        device5.addObserver(ws2);

        WeatherDataUpdater device6 = new WeatherDataUpdater(3);
        WeatherDisplay fo3 = new Forecast();
        device6.addObserver(ws3);
        device6.addObserver(fo3);

        weatherData.removeUpdater(0);
        weatherData.removeUpdater(0);
        weatherData.removeUpdater(0);

        weatherData.addUpdater(device4);
        weatherData.addUpdater(device5);
        weatherData.addUpdater(device6);

        // ---------Test---------
        System.out.println("--------Segundo set--------");
        weatherData.updateValue(50,25,40);

        // ---------Test---------


    }
}
