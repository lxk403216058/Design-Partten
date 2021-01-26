package org.example.strategy.improve;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-26 14:37
 **/
public abstract class Duck {
    /**
     * 属性，策略接口
     */
    FlyBehavior flyBehavior;
    //其他属性，<->策略接口

    public Duck() {

    }

    public void quack() {
        System.out.println("鸭子嘎嘎叫 .....");
    }

    public void swim() {
        System.out.println("鸭子会游泳 .....");
    }

    /**
     * 显示鸭子信息
     */
    public abstract void display();


    public void fly() {
        //改进
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
