package com.ltp.interpreter;

import java.util.Map;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/17 22:12
 */
public abstract class AbstractExpression {

    /**
     * a + b - c
     * @param var 解释公式和数值, key 就是公式(表达式) 参数[a,b,c], value就是就是具体值
     * @return 计算后的结果
     */
    public abstract int interpreter(Map<String, Integer> var);
}
