package org.example.visitor;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-18 14:31
 **/
public abstract class Action {
    /**
     * 得到男生的结果
     *
     * @param man
     */
    public abstract void getManResult(Man man);

    /**
     * 得到女生的结果
     *
     * @param woman
     */
    public abstract void getWomanResult(Woman woman);
}
