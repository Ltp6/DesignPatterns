package com.ltp.decoration;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/7/21 23:42
 */
public class Client {

    public static void main(String[] args) {
        //装饰者模式下订单
        AbstractDrink order = new LongBack();
        System.out.println("费用：" + order.cost() + "\t描述：" + order.getDesc());

        //加入牛奶
        order = new Milk(order);

        System.out.println("加入牛奶费用：" + order.cost() + "\t描述：" + order.getDesc());

        //加入巧克力
        order = new Chocolate(order);
        System.out.println("加入巧克力费用：" + order.cost() + "\t描述：" + order.getDesc());
    }


}
