package com.ltp.single;

//单例模式-->懒汉式(线程安全双重检锁)
public class Demo5 {
    //私有化构造方法
    private Demo5() {
    }

    //创建对象
    private static Demo5 demo;

    //对外提供唯一获取对象的方法
    public static Demo5 getInstance() {
        if (demo == null) {
            synchronized (Demo5.class) {
                if (demo == null) {
                    demo = new Demo5();
                }
            }
        }
        return demo;
    }

}