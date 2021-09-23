package com.ltp.responsibility;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/23 21:58
 */
public class DepartmentApprove extends AbstractApprove {

    public DepartmentApprove(String name) {
        super(name);
    }

    @Override
    protected void processRequest(PurchaseRequest request) {
        if (request.getPrice() <= 5000) {
            System.out.println("请求编号 id= " + request.getId() + "被" + getName() + "处理");
        } else {
            getApprove().processRequest(request);
        }
    }
}
