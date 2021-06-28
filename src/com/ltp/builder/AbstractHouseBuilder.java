package com.ltp.builder;

/**
 * @Description: 抽象的建造者
 * @Author: Ltp
 * @Date: 2020/8/9 23:43
 * @Version： 1.0
 */
public abstract class AbstractHouseBuilder {

    protected House house = new House();

    /**
     * 打地基
     */
    public abstract void buildBase();

    /**
     * 砌墙
     */
    public abstract void buildWall();

    /**
     * 盖屋顶
     */
    public abstract void roofed();

    /**
     * 将建造好的房子返回
     * @return house
     */
    public House buildHouse() {
        return house;
    }
}
