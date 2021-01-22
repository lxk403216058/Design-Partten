package org.example.memento.game;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @description 守护者对象，保存游戏角色的状态
 * @author: lxk
 * @date: 2021-01-22 14:28
 **/
public class Caretaker {

    /**
     * 保存一次状态
     */
    private Memento memento;
    /**
     * 对GameRole 保存多次状态
     */
    //private ArrayList<Memento> mementos;

    /**
     * 对多个游戏角色保存多个状态
     */
    //private HashMap<String, ArrayList<Memento>> rolesMementos;
    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
