package com.ltp.interpreter;

import java.util.Map;

/**
 * @Description: 抽象运算符号解析器 这里，每个运算符号，都只和自己左右两个数字有关系，
 *               但左右两个数字有可能也是一个解析的结果，无论何种类型，都是Expression类的实现类
 * @Author: Ltp
 * @Date: 2021/8/17 22:19
 */
public class SymbolExpression extends AbstractExpression{

    protected AbstractExpression left;
    protected AbstractExpression right;

    public SymbolExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return 0;
    }
}
