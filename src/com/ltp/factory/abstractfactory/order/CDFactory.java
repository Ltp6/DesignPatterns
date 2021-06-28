package com.ltp.factory.abstractfactory.order;

import com.ltp.factory.abstractfactory.computer.CDAcerComputer;
import com.ltp.factory.abstractfactory.computer.CDHPComputer;
import com.ltp.factory.abstractfactory.computer.Computer;

public class CDFactory implements AbsFactroy {
    @Override
    public Computer createComputer(String type) {
        Computer computer = null;
        if ("HP".equals(type)) {
            computer = new CDHPComputer();
        } else if ("Acer".equals(type)) {
            computer = new CDAcerComputer();
        } else {
            System.out.println("输入有误！");
        }
        return computer;


    }
}
