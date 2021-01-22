package org.example.memento.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-22 14:07
 **/
public class Caretaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    /**
     * 获取到第index个Originator 的备忘录对象（即保存状态）
     *
     * @param index
     * @return
     */
    public Memento get(int index) {
        return mementoList.get(index);
    }
}
