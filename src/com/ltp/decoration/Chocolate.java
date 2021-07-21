package com.ltp.decoration;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/7/21 23:40
 */
public class Chocolate extends Decoration {
    public Chocolate(Drink drink) {
        super(drink);
        setDesc("巧克力");
        setPrice(3.0);
    }
}
