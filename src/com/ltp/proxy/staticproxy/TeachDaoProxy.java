package com.ltp.proxy.staticproxy;

import com.ltp.proxy.ITeachDao;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/7/28 23:27
 */
public class TeachDaoProxy implements ITeachDao {

    /**
     * 目标对象
     */
    private final ITeachDao target;

    public TeachDaoProxy(ITeachDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("开始代理。。。。。。。。。。。");
        //代理目标接口
        target.teach();
        System.out.println("结束代理。。。。。。。。。。。");

    }
}
