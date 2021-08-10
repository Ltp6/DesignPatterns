package com.ltp.visitor;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/10 23:50
 */
public abstract class AbstractAction {

    /**
     * 获取女性打分
     * @param abstractPerson person
     */
    protected abstract void getManAction(AbstractPerson abstractPerson);

    /**
     * 获取男性打分
     * @param abstractPerson person
     */
    protected abstract void getWoManAction(AbstractPerson abstractPerson);
}
