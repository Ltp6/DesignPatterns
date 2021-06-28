package com.ltp.single;

//单例模式-->饿汉式(静态常量)
public class Demo1 {
    //私有化构造方法
    private Demo1() {
    }

    //创建对象
    private final static Demo1 demo = new Demo1();
    //对外提供唯一获取对象的方法

    public static Demo1 getInstance() {
        return demo;
    }

}