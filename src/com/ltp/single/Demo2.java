package com.ltp.single;

//单例模式-->饿汉式(静态代码块)
public class Demo2 {
    //私有化构造方法
    private Demo2() {
    }

    //创建对象
    private final static Demo2 demo;
    //对外提供唯一获取对象的方法

    static {
        demo = new Demo2();
    }

    public static Demo2 getInstance() {
        return demo;
    }

}