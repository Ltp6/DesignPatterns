package com.ltp.single;

//单例模式-->懒汉式(线程安全同步方法)
public class Demo4 {
    //私有化构造方法
    private Demo4() {
    }

    //创建对象
    private static Demo4 demo;

    //对外提供唯一获取对象的方法
    public static synchronized Demo4 getInstance() {
        if (demo == null) {
            demo = new Demo4();
        }
        return demo;
    }

}