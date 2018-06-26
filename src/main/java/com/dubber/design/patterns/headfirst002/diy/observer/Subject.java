package com.dubber.design.patterns.headfirst002.diy.observer;

/**
 * Created on 2018/6/26.
 *
 * @author dubber
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
