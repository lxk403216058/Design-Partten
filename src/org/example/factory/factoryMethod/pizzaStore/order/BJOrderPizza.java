package org.example.factory.factoryMethod.pizzaStore.order;

import org.example.factory.factoryMethod.pizzaStore.pizza.BJCheesePizza;
import org.example.factory.factoryMethod.pizzaStore.pizza.BJPepperPizza;
import org.example.factory.factoryMethod.pizzaStore.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }

        return pizza;
    }
}
