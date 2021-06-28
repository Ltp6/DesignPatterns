package com.ltp.single;

//单例模式-->懒汉式(线程安全同步代码块)
public class Demo6 {
    //私有化构造方法
    private Demo6() {
    }

    //创建对象
    private static Demo6 demo;

    //对外提供唯一获取对象的方法
    public static Demo6 getInstance() {
        synchronized (Demo6.class) {
            if (demo == null) {
                demo = new Demo6();
            }
        }
        return demo;
    }

}