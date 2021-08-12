package com.ltp.iterator;

import java.util.Iterator;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/12 23:05
 */
public class ComputerCollege implements College<Department> {


    private Department[] departments;
    /**
     * 保存当前数组个数
     */
    private int index = 0;

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("Java", "Java");
        addDepartment("PHP", "PHP");
        addDepartment("JS", "JS");
        addDepartment("Rust", "Rust");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[index++] = department;
    }

    @Override
    public Iterator<Department> createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
