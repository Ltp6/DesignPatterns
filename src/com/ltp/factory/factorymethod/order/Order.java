package com.ltp.factory.factorymethod.order;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String type;
            if ("BJ".equals(line)) {
                System.out.println("进入北京店：");
                type=scanner.nextLine();
                new BJOrderComputer().createComputer(type).start();
            } else if ("CD".equals(line)) {
                System.out.println("进入成都店");
                type=scanner.nextLine();
                new CDOrderComputer().createComputer(type).start();
            } else {
                System.out.println("重新输入");
            }
        }
    }
}
