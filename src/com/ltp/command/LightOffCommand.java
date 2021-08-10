package com.ltp.command;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/10 23:11
 */
public class LightOffCommand implements Command{

    private final LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.off();
    }

    @Override
    public void undoCommand() {
        lightReceiver.on();
    }
}
