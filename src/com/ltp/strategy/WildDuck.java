package com.ltp.strategy;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/19 22:27
 */
public class WildDuck extends AbstractDuck {

    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    protected void display() {
        System.out.println("野鸭");
        fly();
    }
}
