package com.ltp.factory.abstractfactory.order;

import com.ltp.factory.abstractfactory.computer.BJAcerComputer;
import com.ltp.factory.abstractfactory.computer.BJHPComputer;
import com.ltp.factory.abstractfactory.computer.Computer;

public class BJFactory implements AbsFactroy {
    @Override
    public Computer createComputer(String type) {
        Computer computer = null;
        if ("HP".equals(type)) {
            computer = new BJHPComputer();
        } else if ("Acer".equals(type)) {
            computer = new BJAcerComputer();
        } else {
            System.out.println("输入有误！");
        }
        return computer;
    }
}
