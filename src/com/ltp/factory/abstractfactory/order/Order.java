package com.ltp.factory.abstractfactory.order;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        System.out.println("输入地区：");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String type;
            if ("CD".equals(line)) {
                System.out.println("输入种类");
                type = scanner.nextLine();
                new CDFactory().createComputer(type).start();
            } else if ("BJ".equals(line)) {
                System.out.println("输入种类");
                type = scanner.nextLine();
                new BJFactory().createComputer(type).start();
            }

        }
    }
}
