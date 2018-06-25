package com.dubber.design.patterns.headfirst001.Behavior;

/**
 * Created on 2018/6/25.
 *
 * @author dubber
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }
}
