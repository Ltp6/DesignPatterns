package com.ltp.state;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/19 21:39
 */
public interface State {

    /**
     * 电审
     * @param context 上下文
     */
    default void checkEvent(Context context) {
        throw new UnsupportedOperationException("请在子类实现");
    }

    /**
     * 电审失败
     * @param context 上下文
     */
    default void checkFailEvent(Context context){
        throw new UnsupportedOperationException("请在子类实现");
    }

    /**
     * 定价发布
     * @param context 上下文
     */
    default void makePriceEvent(Context context){
        throw new UnsupportedOperationException("请在子类实现");

    }


    /**
     * 接单
     * @param context 上下文
     */
    default void acceptOrderEvent(Context context){
        throw new UnsupportedOperationException("请在子类实现");

    }

    /**
     * 无人接单失效
     * @param context 上下文
     */
    default void notPeopleAcceptEvent(Context context){
        throw new UnsupportedOperationException("请在子类实现");

    }

    /**
     * 付款
     * @param context 上下文
     */
    default void payOrderEvent(Context context){
        throw new UnsupportedOperationException("请在子类实现");

    }

    /**
     * 接单有人支付失效
     * @param context 上下文
     */
    default void orderFailureEvent(Context context){
        throw new UnsupportedOperationException("请在子类实现");

    }

    /**
     * 反馈
     * @param context 上下文
     */
    default void feedBackEvent(Context context){
        throw new UnsupportedOperationException("请在子类实现");

    }

    /**
     * 获取当前状态
     *
     * @return 状态
     */
    String getCurrentState();
}
