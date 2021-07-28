package com.ltp.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/7/28 23:47
 */
public class ProxyFactory implements MethodInterceptor {

    private final Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理开始");
        Object result = method.invoke(target, args);
        System.out.println("cglib代理结束");
        return result;
    }

    public Object getProxy(){
        //创建工具类
        Enhancer enhancer = new Enhancer();
        //设置父类,就是目标对象
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类对象，即创建代理对象
        return enhancer.create();
    }
}
