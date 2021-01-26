package org.example.strategy.improve;

import java.util.Arrays;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-26 14:51
 **/
public class Client {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();

        ToyDuck toDuck = new ToyDuck();
        toDuck.fly();

        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.fly();
    }
}
