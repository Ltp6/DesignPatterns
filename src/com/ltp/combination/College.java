package com.ltp.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/7/22 0:10
 */
public class College extends AbstractOrganizationComponent{

    /**
     * 存放的Department
     */
    private final List<AbstractOrganizationComponent> LIST = new ArrayList<>();

    public College(String name, String desc) {
        super(name, desc);
    }


    @Override
    protected void add(AbstractOrganizationComponent abstractOrganizationComponent) {
        LIST.add(abstractOrganizationComponent);
    }

    @Override
    protected void remove(AbstractOrganizationComponent abstractOrganizationComponent) {
        LIST.remove(abstractOrganizationComponent);
    }


    @Override
    protected void print() {
        System.out.println("=============学院:" + getName() + "==============");
        LIST.forEach(AbstractOrganizationComponent::print);
    }
}
