package com.ltp.command;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/10 23:05
 */
public interface Command {

    /**
     * 执行命令
     */
    void execute();

    /**
     * 撤销命令
     */
    void undoCommand();
}
