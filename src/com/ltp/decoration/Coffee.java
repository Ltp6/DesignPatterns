package com.ltp.decoration;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/7/21 23:33
 */
public class Coffee extends Drink{
    @Override
    public Double cost() {
        return super.getPrice();
    }
}
