package com.ltp.single;

import java.io.Serializable;
import java.util.Objects;

/**
 * @Description: 单例模式-->懒汉式(线程安全双重检锁)
 * @Author: James.Lee
 * @Date: 2021/9/6 18:21
 */
public class Demo5 implements Serializable {
    /**
     * 创建对象
     */
    private volatile static Demo5 demo;

    /**
     * 私有化构造方法
     */
    private Demo5() {
        // 解决反射破解单例模式
        if (Objects.nonNull(demo)) {
            throw new RuntimeException();
        }
    }

    /**
     * 对外提供唯一获取对象的方法
     *
     * @return 单例对象
     */
    public static Demo5 getInstance() {
        if (demo == null) {
            synchronized (Demo5.class) {
                if (demo == null) {
                    demo = new Demo5();
                }
            }
        }
        return demo;
    }

    /**
     * 解决序列化反序列化破解单例模式
     */
    private Object readResolve() {
        return Demo5.getInstance();
    }
}