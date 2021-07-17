package com.ltp.bridge;

/**
 * @Description:
 * @Author: James.Lee
 * @Date: 2021/7/17 23:52
 */
public class UprightPhone extends AbstractStyle{

    public UprightPhone(Phone phone) {
        super(phone);
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("直立手机打电话");
    }
}
