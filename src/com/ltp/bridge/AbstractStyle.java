package com.ltp.bridge;

/**
 * @Description:
 * @Author: James.Lee
 * @Date: 2021/7/17 23:47
 */
public abstract class AbstractStyle {

    /**
     * 组合手机
     */
    private final Phone phone;

    public AbstractStyle(Phone phone){
        this.phone=phone;
    }

    protected void call(){
        phone.call();
    }
}
