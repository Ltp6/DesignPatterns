package com.ltp.decoration;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/7/21 23:41
 */
public class Milk extends Decoration{
    public Milk(Drink drink) {
        super(drink);
        setDesc("牛奶");
        setPrice(0.45);
    }
}
