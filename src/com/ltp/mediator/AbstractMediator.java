package com.ltp.mediator;

/**
 * @Description:
 * @Author: James.Lee
 * @Date: 2021/8/15 23:01
 */
public abstract class AbstractMediator {

    /**
     * 设置消息
     * @param stateChange 状态变化
     * @param name 名称
     */
    protected abstract void setMessage(int stateChange,String name);

    /**
     * 注册中介者
     * @param name 名称
     * @param abstractColleague 同事类
     */
    protected abstract void register(String name,AbstractColleague abstractColleague);

}
