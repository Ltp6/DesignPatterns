package com.ltp.combination.menu;

/**
 * @Description: TODO
 * @Author: Ltp
 * @Date: 2021/9/15 22:40
 */
public abstract class AbstractMenuComponent {

    protected String name;
    protected Integer level;

    public AbstractMenuComponent(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    public void add(AbstractMenuComponent abstractMenuComponent) {
        throw new UnsupportedOperationException("请在子类实现");
    }

    public void remove(AbstractMenuComponent menuComponent) {
        throw new UnsupportedOperationException("请在子类实现");
    }

    public abstract void print();
}
