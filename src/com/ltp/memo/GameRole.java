package com.ltp.memo;

/**
 * @Description:
 * @Author: James.Lee
 * @Date: 2021/8/16 00:02
 */
public class GameRole {

    /**
     * 攻击力
     */
    private int attack;

    /**
     * 防御力
     */
    private int defense;

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public Memo createMemo() {
        return new Memo(attack, defense);
    }

    public void recovery(Memo memo) {
        this.attack = memo.getAttack();
        this.defense = memo.getDefense();
    }

    public void display() {
        System.out.println(attack + "\t" + defense);
    }


}
