package com.ltp.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/12 23:11
 */
public class InfoCollege implements College<Department> {

    private final List<Department> list;

    public InfoCollege() {
        list = new ArrayList<>();
        list.add(new Department("哈哈", "哈哈"));
        list.add(new Department("呵呵", "呵呵"));
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        list.add(new Department(name, desc));
    }

    @Override
    public Iterator<Department> createIterator() {
        return new InfoCollegeIterator(list);
    }
}
