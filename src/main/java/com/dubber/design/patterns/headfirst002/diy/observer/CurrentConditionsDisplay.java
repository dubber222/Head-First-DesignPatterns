package com.dubber.design.patterns.headfirst002.diy.observer;

/**
 * Created on 2018/6/26.
 *
 * @author dubber
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        dispaly();
    }

    @Override
    public void dispaly() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "CurrentConditionsDisplay{" +
                "temperature=" + temperature +
                " ℃, humidity=" + humidity +
                "% RH}";
    }
}
