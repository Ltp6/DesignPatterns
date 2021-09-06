package com.ltp.single.destroy;

import com.ltp.single.Demo5;

import java.lang.reflect.InvocationTargetException;

/**
 * @Description: 反射破坏单例
 * @Author: James.Lee
 * @Date: 2021/9/6 18:21
 */
public class ReflectDemo {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //懒汉式(线程安全双重检锁)
        var instance = Demo5.getInstance();
        var clazz = instance.getClass();
        //获取默认构造方法
        var constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        var instance1 = constructor.newInstance();
        var instance2 = constructor.newInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1);
        System.out.println(instance2);
    }
}
