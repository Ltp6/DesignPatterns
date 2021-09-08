/*
 * Decompiled with CFR.
 *
 * Could not load the following classes:
 *  com.ltp.proxy.ITeachDao
 */
package com.ltp.proxy.dynamic;

import com.ltp.proxy.ITeachDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

/**
 * 程序运行过程中动态生成的代理类
 */
public final class $Proxy0 extends Proxy implements ITeachDao {

    private static Method m3;

    public $Proxy0(InvocationHandler invocationHandler) {
        super(invocationHandler);
    }

    @Override
    public final void teach() {
        try {
            //调用InvocationHandler
            this.h.invoke(this, m3, null);
        } catch (Error | RuntimeException throwable) {
            throw throwable;
        } catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }

    static {
        try {
            m3 = Class.forName("com.ltp.proxy.ITeachDao").getMethod("teach", new Class[0]);
        } catch (NoSuchMethodException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}