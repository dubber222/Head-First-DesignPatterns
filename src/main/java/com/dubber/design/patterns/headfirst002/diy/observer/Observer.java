package com.dubber.design.patterns.headfirst002.diy.observer;

/**
 * Created on 2018/6/26.
 *
 * @author dubber
 */
public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}
