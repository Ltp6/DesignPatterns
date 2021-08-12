package com.ltp.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/12 23:00
 */
public class InfoCollegeIterator implements Iterator<Department> {

    private final List<Department> list;

    private int index = 0;

    public InfoCollegeIterator(List<Department> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public Department next() {
        return list.get(index++);
    }
}
