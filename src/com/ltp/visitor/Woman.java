package com.ltp.visitor;

/**
 * @Description: 这里使用了双分派，即在客户端中，将具体状态作为参数传递到woman中（第一次分派）
 *               然后woman类用作为参数具体方法中，同时将自己（this）作为参数传入（第二次分派）
 * @Author: Ltp
 * @Date: 2021/8/10 23:52
 */
public class Woman extends AbstractPerson {
    @Override
    protected void accept(AbstractAction abstractAction) {
        abstractAction.getWoManAction(this);
    }
}
