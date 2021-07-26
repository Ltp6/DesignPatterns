package com.ltp.flyweight;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/7/26 23:36
 */
public class ConCreateWebsite extends AbstractWebsite {

    /**
     * 类型
     */
    private final String type;

    public ConCreateWebsite(String type) {
        this.type = type;
    }

    @Override
    protected void use(String name) {
        System.out.println("网站发布形式:" + type + "\t使用人:" + name);
    }
}
