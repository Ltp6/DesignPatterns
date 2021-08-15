package com.ltp.mediator;

/**
 * @Description:
 * @Author: James.Lee
 * @Date: 2021/8/15 23:00
 */
public abstract class AbstractColleague {

    private final AbstractMediator mediator;

    private final String name;

    public AbstractColleague(AbstractMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public AbstractMediator getMediator() {
        return mediator;
    }

    public String getName() {
        return name;
    }

    /**
     * 发送消息
     * @param stateChange 状态值
     */
    public void sendMessage(int stateChange){
        mediator.setMessage(stateChange,name);
    }
}
