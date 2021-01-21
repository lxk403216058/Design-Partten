package org.example.mediator;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-21 14:34
 **/
public abstract class Colleague {
    private Mediator mediator;
    public String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void sendMessage(int stateChange);
}
