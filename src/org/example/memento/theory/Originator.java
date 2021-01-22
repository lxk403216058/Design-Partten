package org.example.memento.theory;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-22 13:56
 **/
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 编写一个方法，保存一个状态对象Memento
     * 返回一个Memento
     *
     * @return
     */
    public Memento saveStateMemento() {
        return new Memento(state);
    }

    /**
     * 通过备忘录对象，恢复状态
     */
    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
