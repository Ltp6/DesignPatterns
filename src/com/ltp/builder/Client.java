package com.ltp.builder;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2020/8/10 0:10
 * @Version： 1.0
 */
public class Client {
    public static void main(String[] args) {
        //普通房子
        CommonHouse commonHouse = new CommonHouse();
        //准备指挥者
        HouseDirector director = new HouseDirector(commonHouse);
        //建造房子，返回产品
        House house = director.constructHouse();
        System.out.println("----------");

        //高楼
        HighBuilding highBuilding = new HighBuilding();
        //重置建造者
        director.setAbstractHouseBuilder(highBuilding);
        House highHouse = director.constructHouse();
        User param = User.builder()
                .username("aaa")
                .password("bbb")
                .build();
        System.out.println(param);
    }
}
