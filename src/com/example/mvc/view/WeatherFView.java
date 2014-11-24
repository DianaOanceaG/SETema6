package com.example.mvc.view;

import java.awt.*;
import java.awt.event.ActionListener; //perform and catch events whenever the user is going to click on things
import javax.swing.*; //for the creation of the UI

/**
 * Created by Diana on 22-Nov-14.
 * this is the "UI"
 */
public class WeatherFView extends JFrame {

    private JLabel templabel=new JLabel("Air temperature is ");
    private JTextField tempval=new JTextField("3.5",10);
    private JLabel umtemplabel=new JLabel("*C");
    private JLabel windspeedlabel=new JLabel("Wind speed is ");
    private JTextField windspeedval=new JTextField("21",10);
    private JLabel umwindspeedlabel=new JLabel("m/s");
    private JLabel airpresslabel=new JLabel("Air pressure is ");
    private JTextField airpressval=new JTextField("23",10);
    private JLabel umairpresslabel=new JLabel("mmHg");
    private JLabel humiditylabel=new JLabel("Air humidity is ");
    private JTextField humidityval=new JTextField("33",10);
    private JLabel umhumiditylabel=new JLabel("%");

    private JButton changeButton=new JButton("CHANGE");

    public WeatherFView ()
    {

        //Set up the view and add components

        //interface to display on the screen
        JPanel Pannel=new JPanel();  //new GridLayout(4,1,4,4));

        //to make sure that when they press X the application is closed
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //set the size of the window
        this.setSize(280,230);

        //add all th components created above to the pannel
        Pannel.add(templabel);
        Pannel.add(tempval);
        Pannel.add(umtemplabel);
        Pannel.add(windspeedlabel);
        Pannel.add(windspeedval);
        Pannel.add(umwindspeedlabel);
        Pannel.add(airpresslabel);
        Pannel.add(airpressval);
        Pannel.add(umairpresslabel);
        Pannel.add(humiditylabel);
        Pannel.add(humidityval);
        Pannel.add(umhumiditylabel);
        Pannel.add(changeButton);

        //add pannel to the JFrame
        this.add(Pannel);

        this.setTitle("Weather Forecast");
    }

    //set the value of the temperature
    public void setTemperature(double temp){tempval.setText(Double.toString(temp));}
    //set the value of the wind speed
    public void setWindSpeed(double windspeed){windspeedval.setText(Double.toString(windspeed));}
    //set the value of the air pressure
    public void setAirPressure(double airpress){airpressval.setText(Double.toString(airpress));}
    //set the value of the air humidity
    public void setAirHumidity(double airhum){humidityval.setText(Double.toString(airhum));}

    /*whenever the change button is clicked  controller is going to be
    allerted of  that fact and a method inside Controller will be executed
    named actionPerformed*/

    public void addWeatherForecastListener(ActionListener listenForchangeButton)
    {
        changeButton.addActionListener(listenForchangeButton);
    }


    //open a popup that contains the error message passed
    public void displayErrorMessage(String errorMess)
    {
        JOptionPane.showMessageDialog(this,errorMess);
    }
}
