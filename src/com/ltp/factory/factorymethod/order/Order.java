package com.ltp.factory.factorymethod.order;

import java.util.Objects;
import java.util.Scanner;

public class Order {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ComputerStore store = null;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String type = null;
            if ("BJ".equals(line)) {
                System.out.println("进入北京店：");
                type = scanner.nextLine();
                store = new ComputerStore(new BJOrderComputerFactory());
            } else if ("CD".equals(line)) {
                System.out.println("进入成都店");
                type = scanner.nextLine();
                store = new ComputerStore(new CDOrderComputerFactory());
            } else {
                System.out.println("重新输入");
            }
            if (Objects.nonNull(store)) {
                store.orderComputer(type).start();
            }
        }
    }
}
