package com.ltp.factory.factorymethod.order;

import com.ltp.factory.factorymethod.computer.BJAcerComputer;
import com.ltp.factory.factorymethod.computer.BJHPComputer;
import com.ltp.factory.factorymethod.computer.Computer;

public class BJOrderComputer extends OrderComputer {
    @Override
    public Computer createComputer(String type) {
        Computer computer = null;
        if ("Acer".equals(type)) {
            computer = new BJAcerComputer();
        } else if ("HP".equals(type)) {
            computer = new BJHPComputer();
        } else {
            System.out.println("输入有误");
        }
        return computer;
    }
}
