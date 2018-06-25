package com.dubber.design.patterns.headfirst001;

import com.dubber.design.patterns.headfirst001.Behavior.FlyBehavior;
import com.dubber.design.patterns.headfirst001.Behavior.QuackBehavior;

/**
 * Created on 2018/6/25.
 *
 * @author dubber
 * 鸭子类
 */
public abstract class Duck {

    /**
     * quack 替换为 QuackBehavior行为类。
     */
    /*public void quack(){
        System.out.println("呱呱呱");
    };*/
    QuackBehavior quackBehavior;


    /**
     * 注意其子类，橡皮鸭如何会飞，岂不滑稽！！
     * fly 替换为 FlyBehavior行为类。
     */
    /*
    public void fly(){
        System.out.println("飞翔");
    }*/
    FlyBehavior flyBehavior;

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void swim(){
        System.out.printf("游泳");
    }

    public abstract void display();

}
