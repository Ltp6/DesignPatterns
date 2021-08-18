package com.ltp.interpreter;

import java.util.Map;

/**
 * @Description: 标量解释器
 * @Author: Ltp
 * @Date: 2021/8/17 22:21
 */
public class VarExpression extends AbstractExpression {

    private final String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return var.get(this.key);
    }
}
