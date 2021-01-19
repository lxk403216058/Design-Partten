package org.example.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-19 14:53
 **/
public class InfoCollegeIterator implements Iterator {
    //信息工程学院是以List方式存放系

    List<Department> departmentList;
    int index = -1;

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (index >= departmentList.size() - 1) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        index++;
        return departmentList.get(index);
    }

    @Override
    public void remove() {

    }
}
