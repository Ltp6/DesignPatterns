package com.ltp.factory.abstractfactory.order;

import com.ltp.factory.abstractfactory.computer.Computer;

public interface AbsFactroy {
    Computer createComputer(String type);
}
