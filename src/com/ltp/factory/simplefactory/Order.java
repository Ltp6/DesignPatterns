package com.ltp.factory.simplefactory;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String type = sc.nextLine();
            SimpleFactory.creatComputer(type).start();
        }


    }
}
