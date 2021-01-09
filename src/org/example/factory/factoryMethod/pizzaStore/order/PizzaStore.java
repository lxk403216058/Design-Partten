package org.example.factory.factoryMethod.pizzaStore.order;

import org.example.factory.factoryMethod.pizzaStore.pizza.BJPepperPizza;

public class PizzaStore {
    public static void main(String[] args) {
        //创建BJ、LD口味的各种披萨
        new BJOrderPizza();
    }
}
