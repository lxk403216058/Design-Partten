package org.example.mediator;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-21 14:50
 **/
public class Curtains extends Colleague {
    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        //创建Curtains同事对象时，将自己放入到ConcreteMediator
        mediator.register(name, this);
    }

    public void upCurtains() {
        System.out.println("开窗帘 .....");
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }
}
