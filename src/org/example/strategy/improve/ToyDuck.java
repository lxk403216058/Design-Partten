package org.example.strategy.improve;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-26 14:26
 **/
public class ToyDuck extends Duck {

    public ToyDuck() {
        flyBehavior = new NoFlyFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("玩具鸭 .....");
    }

    //需要重写所有方法

    @Override
    public void quack() {
        System.out.println("玩具鸭不会嘎嘎叫 .....");
    }

    @Override
    public void swim() {
        System.out.println("玩具鸭不会游泳 .....");
    }

}
