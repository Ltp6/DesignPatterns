package com.ltp.command;

/**
 * @Description: 空实现，为了初始化每个按钮，当调用空命令时，对象什么都不做，可以省掉空判断
 * @Author: Ltp
 * @Date: 2021/8/10 23:13
 */
public class NoCommand implements Command{
    @Override
    public void execute() {

    }

    @Override
    public void undoCommand() {

    }
}
