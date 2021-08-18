package com.ltp.interpreter;

import java.util.Map;
import java.util.Stack;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/17 22:26
 */
public class Calculator {
    /**
     * 定义表达式
     */
    private final AbstractExpression expression;

    public Calculator(String expStr) {
        // 安排运算先后顺序
        Stack<AbstractExpression> stack = new Stack<>();
        // 表达式拆分成字符数组 [a, +, b]
        char[] charArray = expStr.toCharArray();

        AbstractExpression left;
        AbstractExpression right;
        //遍历我们的字符数组， 即遍历  [a, +, b]
        //针对不同的情况，做处理
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    // 从stack取出left => "a"
                    left = stack.pop();
                    // 取出右表达式 "b"
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    // 然后根据得到left 和 right 构建 AddExpresson加入stack
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    //如果是一个 Var 就创建要给 VarExpression 对象，并push到 stack
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
        }
        //当遍历完整个 charArray 数组后，stack 就得到最后Expression
        this.expression = stack.pop();
    }

    public int run(Map<String, Integer> var) {
        //最后将表达式a+b和 var = {a=10,b=20}
        //然后传递给expression的interpreter进行解释执行
        return this.expression.interpreter(var);
    }
}
