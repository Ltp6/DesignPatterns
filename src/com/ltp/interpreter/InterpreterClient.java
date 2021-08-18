package com.ltp.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/17 22:28
 */
public class InterpreterClient {

    public static void main(String[] args) throws IOException {
        // a+b
        String expStr = getExpStr();
        // var {a=10, b=20}
        Map<String, Integer> var = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果：" + expStr + "=" + calculator.run(var));
    }


    /**
     * 获取表达式
     * @return
     * @throws IOException
     */
    public static String getExpStr() throws IOException {
        System.out.print("请输入表达式：");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    /**
     * 获得值映射
     * @param expStr
     * @return
     * @throws IOException
     */
    public static Map<String, Integer> getValue(String expStr) throws IOException {
        Map<String, Integer> map = new HashMap<>(16);

        for (char ch : expStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                if (!map.containsKey(String.valueOf(ch))) {
                    System.out.print("请输入" + ch + "的值：");
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    map.put(String.valueOf(ch), Integer.valueOf(in));
                }
            }
        }

        return map;
    }
}
