package com.dubber.design.patterns.headfirst001;

import com.dubber.design.patterns.headfirst001.Behavior.FlyWithWings;
import com.dubber.design.patterns.headfirst001.Behavior.Quack;

/**
 * Created on 2018/6/25.
 *
 * @author dubber
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display(){
        System.out.println("绿头鸭");
    }

}
