package com.dubber.design.patterns.headfirst001.Behavior;

/**
 * Created on 2018/6/25.
 *
 * @author dubber
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞翔");
    }
}
