package org.example.mediator;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-21 14:49
 **/
public class CoffeeMachine extends Colleague {
    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        //创建CoffeeMachine同事对象时，将自己放入到ConcreteMediator
        mediator.register(name, this);
    }

    public void startCoffee() {
        System.out.println("咖啡机已经启动 .....");
    }

    public void finishCoffee() {
        System.out.println("Wait 5 minutes .....");
        System.out.println("咖啡已经煮完 .....");
        sendMessage(0);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }
}
