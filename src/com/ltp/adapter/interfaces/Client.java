package com.ltp.adapter.interfaces;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/7/15 23:41
 * @Version： 1.0
 */
public class Client {
    public static void main(String[] args) {
        AbstractAdapter abstractAdapter = new AbstractAdapter(){
            @Override
            public void m1() {
                System.out.println("重写m1");
            }
        };
        abstractAdapter.m1();
    }
}
