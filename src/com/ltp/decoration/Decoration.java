package com.ltp.decoration;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/7/21 23:36
 */
public class Decoration extends AbstractDrink {

    private final AbstractDrink abstractDrink;

    public Decoration(AbstractDrink abstractDrink) {
        this.abstractDrink = abstractDrink;
    }

    @Override
    public Double cost() {
        //getPrice 自己的价格
        return super.getPrice() + abstractDrink.cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + "\t" + super.getPrice() + "\t" + abstractDrink.getDesc();
    }
}
