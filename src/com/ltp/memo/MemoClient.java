package com.ltp.memo;

/**
 * @Description:
 * @Author: James.Lee
 * @Date: 2021/8/16 00:05
 */
public class MemoClient {

    public static void main(String[] args) {

        GameRole gameRole = new GameRole();
        gameRole.setAttack(100);
        gameRole.setDefense(100);

        System.out.println("大战前");
        gameRole.display();
        //保存当前状态
        Caretaker caretaker = new Caretaker();
        caretaker.setMemo(gameRole.createMemo());
        System.out.println("大战后");
        gameRole.setAttack(30);
        gameRole.setDefense(39);
        gameRole.display();
        System.out.println("恢复状态");
        gameRole.recovery(caretaker.getMemo());
        gameRole.display();


    }
}
