package com.ltp.memo;

/**
 * @Description:
 * @Author: James.Lee
 * @Date: 2021/8/16 00:00
 */
public class Caretaker {

    /**
     * 保存一次状态，如果想保存多次可以使用集合
     */
    private Memo memo;

    public Memo getMemo() {
        return memo;
    }

    public void setMemo(Memo memo) {
        this.memo = memo;
    }
}
