package com.ltp.strategy;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/19 22:28
 */
public class StrategyClient {

    public static void main(String[] args) {
        AbstractDuck wildDuck = new WildDuck();
        wildDuck.display();

        AbstractDuck toyDuck = new ToyDuck();
        toyDuck.display();

        toyDuck.setFlyBehavior(new BadFlyBehavior());
        toyDuck.display();
    }
}
