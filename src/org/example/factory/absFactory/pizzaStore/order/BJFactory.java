package org.example.factory.absFactory.pizzaStore.order;

import org.example.factory.absFactory.pizzaStore.pizza.BJCheesePizza;
import org.example.factory.absFactory.pizzaStore.pizza.BJPepperPizza;
import org.example.factory.absFactory.pizzaStore.pizza.Pizza;

import java.util.Calendar;

//这是一个工厂子类
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("抽象工厂");
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }

        return pizza;
    }
}
