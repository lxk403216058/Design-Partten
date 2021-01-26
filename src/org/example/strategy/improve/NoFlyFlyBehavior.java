package org.example.strategy.improve;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-26 14:44
 **/
public class NoFlyFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞 .....");
    }
}
