package com.ltp.command;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/10 23:25
 */
public class CommandClient {
    public static void main(String[] args) {

        //创建接收者
        LightReceiver lightReceiver = new LightReceiver();

        //创建电灯命令
        Command lightOffCommand = new LightOffCommand(lightReceiver);
        Command lightOnCommand = new LightOnCommand(lightReceiver);

        //创建遥控器
        RemoteController remoteController = new RemoteController();

        //给遥控器设置命令
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);

        //按下打开
        remoteController.onButtonPush(0);
        //执行撤销
        remoteController.undoButtonPush();

    }
}
