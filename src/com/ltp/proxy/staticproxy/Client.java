package com.ltp.proxy.staticproxy;

import com.ltp.proxy.TeachDao;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/7/28 23:30
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TeachDao teachDao = new TeachDao();
        //创建代理对象
        TeachDaoProxy teachDaoProxy = new TeachDaoProxy(teachDao);
        //代理对象调用目标方法
        teachDaoProxy.teach();
    }
}
