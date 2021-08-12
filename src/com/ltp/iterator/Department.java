package com.ltp.iterator;


/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/7/22 0:12
 */
public class Department  {
    /**
     * 名字
     */
    private String name;
    /**
     * 描述
     */
    private String desc;

    public Department(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

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

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
