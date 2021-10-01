package com.ltp.visitor;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/10 23:50
 */
public abstract class AbstractAction {

    /**
     * 获取男性打分
     * @param man person
     */
    protected abstract void getManAction(Man man);

    /**
     * 获取女性打分
     * @param woman person
     */
    protected abstract void getWoManAction(Woman woman);
}
