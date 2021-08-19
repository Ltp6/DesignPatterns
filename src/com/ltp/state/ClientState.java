package com.ltp.state;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/19 21:54
 */
public class ClientState {
    public static void main(String[] args) {

        //创建context 对象
        Context context = new Context();
        //将当前状态设置为 PublishState
        context.setState(new AllState.PublishState());
        System.out.println(context.getCurrentState());

        //publish --> not pay
        context.acceptOrderEvent(context);
        //not pay --> paid
        context.payOrderEvent(context);
        // 失败, 检测失败时，会抛出异常
        try {
            context.checkFailEvent(context);
            System.out.println("流程正常..");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
