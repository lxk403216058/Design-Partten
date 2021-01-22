package org.example.interpreter;

import java.util.HashMap;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-22 16:24
 **/
public abstract class Expression {

    /**
     * a + b - c
     * 解释公式和数值, key 就是公式(表达式) 参数[a,b,c], value就是就是具体值
     * HashMap {a=10, b=20}
     *
     * @param var
     * @return
     */
    public abstract int interpreter(HashMap<String, Integer> var);
}
