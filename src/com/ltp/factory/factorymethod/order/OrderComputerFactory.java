package com.ltp.factory.factorymethod.order;

import com.ltp.factory.factorymethod.computer.Computer;

public abstract class OrderComputerFactory {
    public abstract Computer createComputer(String type);
}
