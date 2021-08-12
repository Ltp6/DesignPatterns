package com.ltp.iterator;

import java.util.List;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/12 23:14
 */
public class IteratorClient {

    public static void main(String[] args) {

        College<Department> college = new ComputerCollege();
        College<Department> college2 = new InfoCollege();
        List<College<Department>> list = List.of(college, college2);
        OutputImpl output = new OutputImpl(list);
        output.printCollege();
    }
}
