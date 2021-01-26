package org.example.strategy;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-26 14:21
 **/
public abstract class Duck {
    public Duck() {

    }

    /**
     * 显示鸭子的信息
     */
    public abstract void display();

    public void quack() {
        System.out.println("鸭子嘎嘎叫 .....");
    }

    public void swim() {
        System.out.println("鸭子会游泳 .....");
    }

    public void fly() {
        System.out.println("鸭子会飞翔 .....");
    }
}
