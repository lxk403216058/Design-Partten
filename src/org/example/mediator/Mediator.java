package org.example.mediator;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-21 14:36
 **/
public abstract class Mediator {
    /**
     * 将中介者对象，加入到集合中
     *
     * @param name
     * @param alarm
     */
    public abstract void register(String name, Colleague alarm);

    /**
     * 接收消息，具体的同事对象发出消息
     *
     * @param stateChange
     * @param name
     */
    public abstract void getMessage(int stateChange, String name);

    public abstract void sendMessage();
}
