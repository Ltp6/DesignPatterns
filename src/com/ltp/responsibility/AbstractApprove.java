package com.ltp.responsibility;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/23 21:55
 */
public abstract class AbstractApprove {

    private AbstractApprove approve;

    private final String name;

    protected AbstractApprove(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setApprove(AbstractApprove approve) {
        this.approve = approve;
    }

    public AbstractApprove getApprove() {
        return this.approve;
    }

    /**
     * 处理请求
     * @param request 请求参数
     */
    protected abstract void processRequest(PurchaseRequest request);
}
