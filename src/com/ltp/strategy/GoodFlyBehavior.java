package com.ltp.strategy;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/19 22:22
 */
public class GoodFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("飞行技术好！！！");
    }
}
