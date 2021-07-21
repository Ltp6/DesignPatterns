package com.ltp.combination;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/7/22 0:00
 */
public abstract class AbstractOrganizationComponent {

    /**
     * 名字
     */
    private String name;
    /**
     * 描述
     */
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    protected void add(AbstractOrganizationComponent abstractOrganizationComponent) {
        //默认实现
        throw new UnsupportedOperationException("请在子类实现");
    }

    protected void remove(AbstractOrganizationComponent abstractOrganizationComponent) {
        //默认实现
        throw new UnsupportedOperationException("请在子类实现");
    }

    /**
     * 打印方法
     */
    protected  abstract void print();

    public AbstractOrganizationComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
}
