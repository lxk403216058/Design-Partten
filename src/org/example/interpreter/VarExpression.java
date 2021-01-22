package org.example.interpreter;

import java.util.HashMap;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-22 16:26
 **/
public class VarExpression extends Expression {
    /**
     * key=a,key=b,key=c
     */
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    /**
     * var 就是{a=10, b=20}
     * interpreter 根据 变量名称，返回对应值
     *
     * @param var
     * @return
     */

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
