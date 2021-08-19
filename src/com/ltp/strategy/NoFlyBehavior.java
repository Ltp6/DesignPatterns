package com.ltp.strategy;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/19 22:23
 */
public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞！！");
    }
}
