package com.ltp.responsibility;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/23 21:55
 */
public abstract class AbstractApprove {

    private AbstractApprove abstractApprove;

    private String name;

    public AbstractApprove(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAbstractApprove(AbstractApprove abstractApprove) {
        this.abstractApprove = abstractApprove;
    }

    public AbstractApprove getAbstractApprove() {
        return abstractApprove;
    }

    /**
     * 处理请求
     * @param request 请求参数
     */
    protected abstract void processRequest(PurchaseRequest request);
}
