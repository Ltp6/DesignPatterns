package com.ltp.combination;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/7/22 0:14
 */
public class Client {
    public static void main(String[] args) {
        University university = new University("西科大", "牛逼");
        College college1 = new College("材料学院", "材料");
        College college2 = new College("计算机学院", "计算机");
        university.add(college1);
        university.add(college2);

        Department department = new Department("功能材料", "电子信息材料");
        college1.add(department);
        college2.add(department);
        university.print();
    }
}
