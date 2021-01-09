package org.example.factory.absFactory.pizzaStore.order;


import org.example.factory.absFactory.pizzaStore.pizza.Pizza;

//一个抽象工厂模式的抽象层（接口）
public interface AbsFactory {
    //让下面的子工厂类来具体实现
    Pizza createPizza(String orderType);
}
