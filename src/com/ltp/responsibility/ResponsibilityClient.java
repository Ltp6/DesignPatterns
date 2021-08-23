package com.ltp.responsibility;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/23 22:06
 */
public class ResponsibilityClient {

    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(1L, 1, 5001.0);

        AbstractApprove department = new DepartmentApprove("老师");
        AbstractApprove college = new CollegeApprove("主任");
        AbstractApprove schoolMaster = new SchoolMasterApprove("校长");

        //处理人构成一个环形结构
        department.setAbstractApprove(college);
        college.setAbstractApprove(schoolMaster);
        schoolMaster.setAbstractApprove(department);

        department.processRequest(purchaseRequest);
    }
}
