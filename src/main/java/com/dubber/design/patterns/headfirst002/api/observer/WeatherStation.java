package com.dubber.design.patterns.headfirst002.api.observer;

/**
 * Created on 2018/6/26.
 *
 * @author dubber
 */
public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(1.1f, 2.2f, 3.3f);
        // 真漂亮的天气预报。

    }
}
