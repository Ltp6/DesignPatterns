package com.ltp.visitor;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/11 0:04
 */
public class VisitorClient {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new Man());
        objectStructure.add(new Woman());
        objectStructure.add(new Man());

        AbstractAction success = new Success();

        objectStructure.display(success);
        System.out.println("============");
        AbstractAction fail = new Fail();
        objectStructure.display(fail);
    }
}
