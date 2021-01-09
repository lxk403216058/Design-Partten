package org.example.factory.absFactory.pizzaStore.order;

import org.example.factory.absFactory.pizzaStore.pizza.LDCheesePizza;
import org.example.factory.absFactory.pizzaStore.pizza.LDPepperPizza;
import org.example.factory.absFactory.pizzaStore.pizza.Pizza;

public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("抽象工厂");
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }

        return pizza;
    }
}
