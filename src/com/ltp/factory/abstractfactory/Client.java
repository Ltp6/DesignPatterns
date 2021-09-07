package com.ltp.factory.abstractfactory;


public class Client {
    public static void main(String[] args) {
        //创建的是意大利风味甜品工厂对象
        DessertFactory factory = new ItalyDessertFactory();
//        DessertFactory factory = new AmericanDessertFactory();
        //获取拿铁咖啡和提拉米苏甜品
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();

        System.out.println(coffee.getName());
        dessert.show();
    }
}
