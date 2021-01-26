package org.example.strategy.improve;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-26 14:43
 **/
public class BadFlyFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞翔技术一般 .....");
    }
}
