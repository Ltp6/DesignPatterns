package com.ltp.visitor;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/10 23:52
 */
public class Man extends AbstractPerson {
    @Override
    protected void accept(AbstractAction abstractAction) {
        abstractAction.getManAction(this);
    }
}
