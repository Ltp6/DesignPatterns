package com.ltp.command;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/10 23:15
 */
public class RemoteController {


    /**
     * 开按钮数组
     */
    private final Command[] onCommands;
    /**
     * 关按钮数组
     */
    private final Command[] offCommands;
    /**
     * 撤销命令
     */
    private Command undoCommand;

    /**
     * 构造器初始化数组
     */
    public RemoteController() {
        int size = 5;
        this.onCommands = new Command[size];
        this.offCommands = new Command[size];
        for (int i = 0; i < size; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
        undoCommand = new NoCommand();
    }

    /**
     * 设置命令
     *
     * @param index      索引
     * @param onCommand  打开命令
     * @param offCommand 关闭命令
     */
    public void setCommand(int index, Command onCommand, Command offCommand) {
        onCommands[index] = onCommand;
        offCommands[index] = offCommand;

    }

    /**
     * 按下打开按钮
     *
     * @param index 索引
     */
    public void onButtonPush(int index) {
        //执行相应方法
        onCommands[index].execute();
        //记录这次操作
        undoCommand=onCommands[index];
    }

    /**
     * 按下关闭按钮
     *
     * @param index 索引
     */
    public void offButtonPush(int index) {
        //执行相应方法
        offCommands[index].execute();
        //记录这次操作
        undoCommand=offCommands[index];
    }

    /**
     * 按下撤销按钮
     */
    public void undoButtonPush() {
        undoCommand.undoCommand();
    }
}
