package org.example.factory.simpleFactory.pizzaStore.order;

//相当于一个客户端，发出订购
public class PizzaStore {
    public static void main(String[] args) {
        //new OrderPizza();

        //使用简单工厂模式
        new OrderPizza2();
        System.out.println("~退出程序~");
    }
}
