package com.ltp.visitor;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/10 23:50
 */
public abstract class AbstractPerson {

    /**
     * 提供一个方法让访问者访问
     * @param abstractAction 评分
     */
    protected abstract void accept(AbstractAction abstractAction);
}
