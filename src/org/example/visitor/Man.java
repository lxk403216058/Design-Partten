package org.example.visitor;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-18 14:33
 **/
public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
