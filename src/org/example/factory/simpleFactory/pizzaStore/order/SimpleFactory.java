package org.example.factory.simpleFactory.pizzaStore.order;

import org.example.factory.simpleFactory.pizzaStore.pizza.CheesePizza;
import org.example.factory.simpleFactory.pizzaStore.pizza.GreekPizza;
import org.example.factory.simpleFactory.pizzaStore.pizza.PepperPizza;
import org.example.factory.simpleFactory.pizzaStore.pizza.Pizza;

//简单工厂类
public class SimpleFactory {

    //根据orderType,返回对应的pizza
    public static Pizza createPizza(String orderType){
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨 ");
        } else if(orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨 ");
        } else if (orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨 ");
        }
        return pizza;
    }

}
