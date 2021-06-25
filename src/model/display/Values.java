package model.display;

public class Values {
    double temp =0, humid =0, pressure =0;
    public Values(double t, double h, double p){temp = t; humid = h; pressure = p;}
    public double getTemp(){return temp;}
    public double getHumid(){return humid;}
    public double getPressure(){return pressure;}
}
