package com.ltp.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/12 23:18
 */
public class OutputImpl {

    private final List<College<Department>> list;

    public OutputImpl(List<College<Department>> list) {
        this.list = list;
    }

    public void printCollege(){
        for (College<Department> next : list) {
            System.out.println(next.getName());
            printList(next.createIterator());
        }
    }

    private void printList(Iterator<Department> iter){
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
