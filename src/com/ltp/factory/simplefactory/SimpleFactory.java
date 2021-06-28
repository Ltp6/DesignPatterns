package com.ltp.factory.simplefactory;

import com.ltp.factory.simplefactory.computer.AcerComputer;
import com.ltp.factory.simplefactory.computer.Computer;
import com.ltp.factory.simplefactory.computer.HPComputer;
import com.ltp.factory.simplefactory.computer.LenovoComputer;

public class SimpleFactory {

    public static Computer creatComputer(String type) {
        Computer computer = null;
        switch (type) {
            case "Lenovo":
                computer = new LenovoComputer();
                break;
            case "Acer":
                computer = new AcerComputer();
                break;
            case "HP":
                computer = new HPComputer();
                break;
        }
        return computer;
    }
}
