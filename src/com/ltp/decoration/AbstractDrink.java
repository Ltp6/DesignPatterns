package com.ltp.decoration;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/7/21 23:24
 */
public abstract class AbstractDrink {

    /**
     * 描述
     */
    private String desc;

    /**
     * 价格
     */
    private Double price;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 计算价格抽象类
     * @return 价格
     */
    public abstract Double cost();
}
