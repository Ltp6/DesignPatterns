package com.ltp.factory.factorymethod.order;

import com.ltp.factory.factorymethod.computer.CDAcerComputer;
import com.ltp.factory.factorymethod.computer.CDHPComputer;
import com.ltp.factory.factorymethod.computer.Computer;

public class CDOrderComputer extends OrderComputer {
    @Override
    public Computer createComputer(String type) {
        Computer computer = null;
        if ("Acer".equals(type)) {
            computer = new CDAcerComputer();
        } else if ("HP".equals(type)) {
            computer = new CDHPComputer();
        } else {
            System.out.println("输入有误");
        }
        return computer;
    }
}
