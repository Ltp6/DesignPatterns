package com.ltp.adapter.object;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2020/8/30 23:11
 * @Version： 1.0
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("对象适配器");
        Phone phone = new Phone();
        phone.charge(new VoltageAdapter(new Voltage220()));
    }
}
