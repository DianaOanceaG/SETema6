package com.example.mvc.model;

/**
 * Created by Diana on 22-Nov-14.
 */
/*will do all the actions
*  here it will get the random values for the temperature, wind speed, air pressure and air humidity
*  and these values will be used by the Controller when the update button is pressed, and the View will be updated
*  with the new values
* */
public class WeatherFModel {

    private double temperature ;
    private double wind_speed ;
    private double air_pressure ;
    private double air_humidy;

    public WeatherFModel() {

    }

    public void updateValues()
    {
        double aux;
        //Math.random() generereaza nr aleatorii intr 0.0 si 1.0
        //for range[min,max] we have formula:min+Math.random()*((max-min)+1)
        //temperature range [-100,100] *C
        aux=-100.0+Math.random()*((100.0-(-100.0))+1.0);
        temperature=Math.round(aux*100)/100.0d; //precizie pe 3 zecimale

       //air speed range [0,150]m/s
        aux=Math.random()*(150.0+1.0);
        wind_speed=Math.round(aux*100)/100.0d;

        //air pressure range [10,50] mmHg
        aux=10.0+Math.random()*((50.0-10.0)+1);
        air_pressure=Math.round(aux*100)/100.0d;

        /*The relative humidity (%)
        * range [10,50] %
        * */

         aux=(10.0+Math.random()*((50.0-10.0)+1));
         air_humidy=Math.round(aux*100)/100.0d;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getWind_speed() {
        return wind_speed;
    }

    public double getAir_pressure() {
        return air_pressure;
    }

    public double getAir_humidy() {
        return air_humidy;
    }
}
