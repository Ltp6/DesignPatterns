package com.ltp.builder;

/**
 * @Description: 指挥者动态的区指定，建造的房子类型
 * @Author: Ltp
 * @Date: 2020/8/10 0:02
 * @Version： 1.0
 */
public class HouseDirector {
    AbstractHouseBuilder abstractHouseBuilder = null;

    /**
     * 构造器传入
     */
    public HouseDirector(AbstractHouseBuilder abstractHouseBuilder) {
        this.abstractHouseBuilder = abstractHouseBuilder;
    }

    /**
     * 通过set方法注入
     *
     * @param abstractHouseBuilder
     */
    public void setAbstractHouseBuilder(AbstractHouseBuilder abstractHouseBuilder) {
        this.abstractHouseBuilder = abstractHouseBuilder;
    }

    /**
     * 如何处理建房子的流程，交给指挥者
     * @return
     */
    public House constructHouse() {
        abstractHouseBuilder.buildBase();
        abstractHouseBuilder.buildWall();
        abstractHouseBuilder.buildWall();
        return abstractHouseBuilder.buildHouse();
    }
}
