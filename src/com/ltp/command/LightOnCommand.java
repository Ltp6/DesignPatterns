package com.ltp.command;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/10 23:06
 */
public class LightOnCommand implements Command{

    private final LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undoCommand() {
        System.out.println("=============执行撤销============");
        lightReceiver.off();
    }
}
