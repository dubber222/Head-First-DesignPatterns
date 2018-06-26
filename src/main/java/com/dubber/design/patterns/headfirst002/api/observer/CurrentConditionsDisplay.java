package com.dubber.design.patterns.headfirst002.api.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created on 2018/6/26.
 *
 * @author dubber
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {

    private float temperature;
    private float humidity;
    private Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            this.temperature =((WeatherData) o).getTemperature();
            this.humidity =((WeatherData) o).getHumidity();
            dispaly();
        }
    }

    @Override
    public String toString() {
        return "CurrentConditionsDisplay{" +
                "temperature=" + temperature +
                " ℃, humidity=" + humidity +
                "% RH}";
    }

    @Override
    public void dispaly() {
        System.out.println(toString());
    }
}
