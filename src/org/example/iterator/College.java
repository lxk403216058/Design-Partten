package org.example.iterator;

import java.util.Iterator;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-19 14:58
 **/
public interface College {

    public String getName();


    /**
     * 增加系的方法
     *
     * @param name
     * @param desc
     */
    public void addDepartment(String name, String desc);

    /**
     * 返回一个迭代器，遍历
     *
     * @return 返回一个迭代器，遍历
     */
    public Iterator createIterator();
}
