package com.ltp.iterator;

import java.util.Iterator;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/12 23:03
 */
public interface College<T> {

    String getName();

    void addDepartment(String name,String desc);

    Iterator<T> createIterator();
}
