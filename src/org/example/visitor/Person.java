package org.example.visitor;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-18 14:33
 **/
public abstract class Person {
    /**
     * 提供一个2方法，让访问者可以访问
     *
     * @param action
     */
    public abstract void accept(Action action);
}
