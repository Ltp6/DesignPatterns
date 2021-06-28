package com.ltp.builder;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2020/8/9 23:56
 * @Version： 1.0
 */
public class CommonHouse extends AbstractHouseBuilder {

    @Override
    public void buildBase() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房子砌墙");

    }

    @Override
    public void roofed() {
        System.out.println("普通房子建屋顶");
    }
}
