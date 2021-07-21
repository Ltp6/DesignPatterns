package com.ltp.decoration;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/7/21 23:36
 */
public class Decoration extends Drink {

    private final Drink drink;

    public Decoration(Drink drink) {
        this.drink = drink;
    }

    @Override
    public Double cost() {
        //getPrice 自己的价格
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + "\t" + super.getPrice() + "\t" + drink.getDesc();
    }
}
