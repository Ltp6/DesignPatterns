package com.ltp.builder;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2020/8/9 23:59
 * @Version： 1.0
 */
public class HighBuilding extends AbstractHouseBuilder {
    @Override
    public void buildBase() {
        System.out.println("高楼地基");
    }

    @Override
    public void buildWall() {
        System.out.println("高楼砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼盖屋顶");

    }
}
