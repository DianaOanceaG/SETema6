package com.example.mvc;

import com.example.mvc.controller.WeatherFController;
import com.example.mvc.model.WeatherFModel;
import com.example.mvc.view.WeatherFView;

/**
 * Created by Diana on 22-Nov-14.
 *
 * This is the Main class that represents the entry point to our program
 */
public class MVCWeatherForecast {
    public static void main(String[] args) {
        // Instantiate the MVC elements
        WeatherFView theView=new WeatherFView();

        WeatherFModel theModel=new WeatherFModel();
        // Tell the controller about the model and the view
        WeatherFController theController=new WeatherFController(theView,theModel);

        // Display the view
        theView.setVisible(true);
    }

}
