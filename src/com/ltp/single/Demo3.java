package com.ltp.single;

//单例模式-->懒汉式(线程不安全)
public class Demo3 {
    //私有化构造方法
    private Demo3() {
    }

    //创建对象
    private static Demo3 demo;

    //对外提供唯一获取对象的方法
    public static Demo3 getInstance() {
        if (demo == null) {
            demo = new Demo3();
        }
        return demo;
    }

}