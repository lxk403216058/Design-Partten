package org.example.interpreter;

import java.util.HashMap;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-22 16:36
 **/
public class SubExpression extends SymbolExpression {
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * 求出left 和 right 表达式相减后的结果
     *
     * @param var
     * @return
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
