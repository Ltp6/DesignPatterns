package com.ltp.proxy;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/7/28 23:27
 */
public class TeachDao implements ITeachDao{
    @Override
    public void teach() {
        System.out.println("开始上课。。。。。");
    }
}
