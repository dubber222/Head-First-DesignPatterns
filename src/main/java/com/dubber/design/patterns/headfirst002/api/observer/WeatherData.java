package com.dubber.design.patterns.headfirst002.api.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created on 2018/6/26.
 *
 * @author dubber
 */
public class WeatherData extends Observable {

    private List observers = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;


    //测量数据改变
    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    // 设置测试值
    public void setMeasurements(float temperature,float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}
