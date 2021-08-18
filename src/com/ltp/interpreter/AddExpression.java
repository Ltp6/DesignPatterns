package com.ltp.interpreter;

import java.util.Map;

/**
 * @Description: 加法解释器
 * @Author: Ltp
 * @Date: 2021/8/17 22:25
 */
public class AddExpression extends SymbolExpression{
    public AddExpression(AbstractExpression left, AbstractExpression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
