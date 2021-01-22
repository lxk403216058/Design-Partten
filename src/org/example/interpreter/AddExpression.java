package org.example.interpreter;

import java.util.HashMap;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-22 16:29
 **/
public class AddExpression extends SymbolExpression {
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * 处理相加
     * var 仍然是{a=10 b=20}
     *
     * @param var
     * @return
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        //super.left.interpreter(var)： 返回left 表达式对应的值 a = 10
        //super.right.interpreter(var)：返回right 表达式对应的值 b = 20
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
