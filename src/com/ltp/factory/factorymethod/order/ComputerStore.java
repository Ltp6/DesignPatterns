package com.ltp.factory.factorymethod.order;

import com.ltp.factory.factorymethod.computer.Computer;

/**
 * @Description: TODO
 * @Author: Ltp
 * @Date: 2021/9/7 22:46
 */
public class ComputerStore {

    private final OrderComputerFactory orderComputerFactory;

    public ComputerStore(OrderComputerFactory orderComputerFactory) {
        this.orderComputerFactory = orderComputerFactory;
    }

    public Computer orderComputer(String type) {
        return orderComputerFactory.createComputer(type);
    }
}
