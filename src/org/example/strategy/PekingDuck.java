package org.example.strategy;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-26 14:24
 **/
public class PekingDuck extends Duck {
    @Override
    public void display() {
        System.out.println("北京鸭 .....");
    }

    /**
     * 北京鸭不能飞翔，因此要重写fly
     */
    @Override
    public void fly() {
        System.out.println("北京鸭不能飞翔 .....");
    }
}
