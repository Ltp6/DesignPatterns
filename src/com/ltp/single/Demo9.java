package com.ltp.single;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @Description:
 * @Author: James.Lee
 * @Date: 2021/7/16 11:10
 */
public class Demo9 {

    /** 利用AtomicReference */
    private static final AtomicReference<Demo9> INSTANCE = new AtomicReference<>();
    /**
     * 私有化构造器
     */
    private Demo9(){
    }
    /**
     * 用CAS确保线程安全
     */
    public static Demo9 getInstance(){
        for (;;) {
            Demo9 current = INSTANCE.get();
            if (current != null) {
                return current;
            }
            current = new Demo9();
            if (INSTANCE.compareAndSet(null, current)) {
                return current;
            }
        }
    }
}
