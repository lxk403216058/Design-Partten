package org.example.mediator;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-21 14:37
 **/
public class Alarm extends Colleague {
    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        //创建Alarm同事对象时，将自己放入到ConcreteMediator
        mediator.register(name, this);
    }

    public void sendAlarm(int stateChange) {
        sendMessage(stateChange);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }
}
