package com.dubber.design.patterns.headfirst001;

import com.dubber.design.patterns.headfirst001.Behavior.FlyNoWay;
import com.dubber.design.patterns.headfirst001.Behavior.FlyWithWings;
import com.dubber.design.patterns.headfirst001.Behavior.Quack;

/**
 * Created on 2018/6/25.
 *
 * @author dubber
 */
public class Bootstrap {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.setQuackBehavior(new Quack());
        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.performQuack();
        mallardDuck.performFly();
    }
}
