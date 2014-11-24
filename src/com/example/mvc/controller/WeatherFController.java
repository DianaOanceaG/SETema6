package com.example.mvc.controller;

import com.example.mvc.model.WeatherFModel;
import com.example.mvc.view.WeatherFView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Diana on 22-Nov-14.
 */
//the Controller handles the interaction between the View and the user

public class WeatherFController {

    //the Controller needs to interact with the Model and the View
    private WeatherFView theView=new WeatherFView();
    private WeatherFModel theModel=new WeatherFModel();

    public WeatherFController(WeatherFView theView, WeatherFModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        /*Tell the View that whenever the change  button
        is clicked to execute the actionPerformed method
         in the changeListener inner class
        */
        this.theView.addWeatherForecastListener(new changeListener());
    }

    public class changeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent arg0)
        {
            try {
                //schimbam valorile
                theModel.updateValues();

                theView.setTemperature(theModel.getTemperature());
                theView.setWindSpeed(theModel.getWind_speed());
                theView.setAirPressure(theModel.getAir_pressure());
                theView.setAirHumidity(theModel.getAir_humidy());
            } catch (Exception e) {
               // e.printStackTrace();
                System.out.println(e);
                theView.displayErrorMessage("An error occurred while generating the values for the weather forecast parameters!");
            }
        }

    }
}
