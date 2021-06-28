package com.ltp.single;

public class SinglePatterns {
    public static void main(String[] args) {
        Demo8 demo1 = Demo8.INSTANCE;
        Demo8 demo2 = Demo8.INSTANCE;
        System.out.println(demo1 == demo2);
        System.out.println(demo1.hashCode() + "\n" + demo2.hashCode());
        System.out.println(Runtime.getRuntime().availableProcessors());

    }
}


