package com.ltp.bridge;

/**
 * @Description:
 * @Author: James.Lee
 * @Date: 2021/7/18 00:06
 */
public class FoldPhone extends AbstractStyle{
    public FoldPhone(Phone phone) {
        super(phone);
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("折叠手机打电话");
    }
}
