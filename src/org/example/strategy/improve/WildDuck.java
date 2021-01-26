package org.example.strategy.improve;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-26 14:48
 **/
public class WildDuck extends Duck {

    public WildDuck() {
        flyBehavior = new GoodFlayBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是野鸭 .....");
    }
}
