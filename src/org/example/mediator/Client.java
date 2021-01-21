package org.example.mediator;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-21 15:03
 **/
public class Client {
    public static void main(String[] args) {
        //创建一个具体的中介者对象
        Mediator mediator = new ConcreteMediator();

        //创建Alarm 并且加入到 ConcreteMediator 对象的HashMap
        Alarm alarm = new Alarm(mediator, "Alarm");
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");
        Curtains curtains = new Curtains(mediator, "curtains");
        TV tv = new TV(mediator, "TV");
        alarm.sendAlarm(0);
        coffeeMachine.finishCoffee();
        alarm.sendAlarm(1);
    }
}
