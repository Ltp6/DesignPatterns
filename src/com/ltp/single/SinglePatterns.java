package com.ltp.single;

public class SinglePatterns {
    public static void main(String[] args) {
        Demo8 demo1 = Demo8.INSTANCE;
        Demo8 demo2 = Demo8.INSTANCE;
        System.out.println(demo1 == demo2);
        System.out.println(demo1.hashCode() + "\n" + demo2.hashCode());
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println("CAS单例");
        for (int i = 0; i < 100; i++) {
            new Thread(()-> System.out.println(Demo9.getInstance())).start();
        }
    }
}


