package com.ltp.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 就是composite可以管理大学
 * @Author: Ltp
 * @Date: 2021/7/22 0:04
 */
public class University extends AbstractOrganizationComponent {

    /**
     * 存放的College
     */
    private final List<AbstractOrganizationComponent> LIST = new ArrayList<>();

    public University(String name, String desc) {
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
        System.out.println("=============大学:" + getName() + "==============");
        LIST.forEach(AbstractOrganizationComponent::print);
    }
}
