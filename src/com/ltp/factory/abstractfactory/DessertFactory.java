package com.ltp.factory.abstractfactory;


public interface DessertFactory {

    /**
     * 生产咖啡的功能
     * @return
     */
    Coffee createCoffee();

    /**
     * 生产甜品的功能
     * @return
     */
    Dessert createDessert();
}
