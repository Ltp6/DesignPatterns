package com.ltp.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/7/28 23:33
 */
public class ProxyFactory {

    /**
     * 目标对象
     */
    private final Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("代理开始。。。。。。。。。");
                    Object result = method.invoke(target, args);
                    System.out.println("代理结束。。。。。。。。。");
                    return result;
                });
    }
}
