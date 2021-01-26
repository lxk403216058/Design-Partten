package org.example.strategy.improve;


/**
 * @description
 * @author: lxk
 * @date: 2021-01-26 14:24
 **/
public class PekingDuck extends Duck {

    public PekingDuck() {
        flyBehavior = new BadFlyFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("北京鸭 .....");
    }

}
