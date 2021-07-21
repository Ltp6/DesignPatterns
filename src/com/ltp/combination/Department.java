package com.ltp.combination;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/7/22 0:12
 */
public class Department extends AbstractOrganizationComponent{

    public Department(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void print() {
        System.out.println("=============专业:" + getName() + "==============");
    }
}
