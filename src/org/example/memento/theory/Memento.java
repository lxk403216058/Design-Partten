package org.example.memento.theory;

/**
 * @descriptionn
 * @author: lxk
 * @date: 2021-01-22 13:59
 **/
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
