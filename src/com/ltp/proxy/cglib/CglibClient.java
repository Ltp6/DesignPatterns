package com.ltp.proxy.cglib;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/7/28 23:36
 */
public class CglibClient {
    public static void main(String[] args) {
        //创建目标对象
        CglibTeachDao teachDao = new CglibTeachDao();
        CglibTeachDao proxy = (CglibTeachDao) new ProxyFactory(teachDao).getProxy();
        //执行目标方法 触发intercept方法
        proxy.teach();
    }
}
