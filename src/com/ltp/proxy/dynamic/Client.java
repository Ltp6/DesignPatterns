package com.ltp.proxy.dynamic;

import com.ltp.proxy.ITeachDao;
import com.ltp.proxy.TeachDao;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/7/28 23:36
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TeachDao teachDao = new TeachDao();
        ProxyFactory proxyFactory = new ProxyFactory(teachDao);
        ITeachDao proxy = (ITeachDao)proxyFactory.getProxy();
        proxy.teach();
    }
}
