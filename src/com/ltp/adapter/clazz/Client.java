package com.ltp.adapter.clazz;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2020/8/30 23:11
 * @Version： 1.0
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("类适配器");
        Phone phone = new Phone();
        phone.charge(new VoltageAdapter());
    }
}
