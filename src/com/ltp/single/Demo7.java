package com.ltp.single;

public class Demo7 {
    private static volatile Demo7 instance;

    //构造器私有化
    private Demo7() {
    }

    //写一个静态内部类,该类中有一个静态属性 Singleton
    private static class SingletonInstance {
        private static final Demo7 INSTANCE = new Demo7();
    }

    public static Demo7 getInstance() {
        return SingletonInstance.INSTANCE;
    }


}
