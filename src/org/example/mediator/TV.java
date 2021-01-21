package org.example.mediator;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-21 14:49
 **/
public class TV extends Colleague {
    public TV(Mediator mediator, String name) {
        super(mediator, name);
        //创建TV同事对象时，将自己放入到ConcreteMediator
        mediator.register(name, this);
    }

    public void startTv() {
        System.out.println("开电视 .....");
    }

    public void stopTv() {
        System.out.println("关电视 .....");
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }
}
