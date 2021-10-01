package com.ltp.visitor;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/10 23:54
 */
public class Fail extends AbstractAction{
    @Override
    protected void getManAction(Man man) {
        System.out.println("男性歌手很失败！");
    }

    @Override
    protected void getWoManAction(Woman woman) {
        System.out.println("女性歌手很失败！");
    }
}
