package com.ltp.interpreter;

import java.util.Map;

/**
 * @Description: 减法解释器
 * @Author: Ltp
 * @Date: 2021/8/17 22:22
 */
public class SubExpression extends SymbolExpression {
    public SubExpression(AbstractExpression left, AbstractExpression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
