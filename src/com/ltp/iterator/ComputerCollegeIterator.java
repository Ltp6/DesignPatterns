package com.ltp.iterator;

import java.util.Iterator;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/12 22:53
 */
public class ComputerCollegeIterator implements Iterator<Department> {

    /**
     * 部门数组
     */
    private final Department[] departments;

    /**
     * 数组初始位置
     */
    private int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }


    @Override
    public boolean hasNext() {
        return position < departments.length;
    }

    @Override
    public Department next() {
        return departments[position++];
    }
}
