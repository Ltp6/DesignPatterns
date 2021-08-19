package com.ltp.strategy;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/19 22:30
 */
public class ToyDuck extends AbstractDuck {

    public ToyDuck() {
        flyBehavior=new NoFlyBehavior();
    }

    @Override
    protected void display() {
        System.out.println("玩具鸭");
        fly();
    }
}
