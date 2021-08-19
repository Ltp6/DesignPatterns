package com.ltp.state;

/**
 * @Description: 各种具体状态类
 * @Author: Ltp
 * @Date: 2021/8/19 21:51
 */
public class AllState {

    static class FeedBackState implements State {

        @Override
        public String getCurrentState() {
            return StateEnum.FEED_BACKED.getValue();
        }
    }

    static class GenerateState implements State {

        @Override
        public void checkEvent(Context context) {
            context.setState(new ReviewState());
        }

        @Override
        public void checkFailEvent(Context context) {
            context.setState(new FeedBackState());
        }

        @Override
        public String getCurrentState() {
            return StateEnum.GENERATE.getValue();
        }
    }

    static class NotPayState implements State {

        @Override
        public void payOrderEvent(Context context) {
            context.setState(new PaidState());
        }

        @Override
        public void feedBackEvent(Context context) {
            context.setState(new FeedBackState());
        }

        @Override
        public String getCurrentState() {
            return StateEnum.NOT_PAY.getValue();
        }
    }

    static class PaidState implements State {

        @Override
        public void feedBackEvent(Context context) {
            context.setState(new FeedBackState());
        }

        @Override
        public String getCurrentState() {
            return StateEnum.PAID.getValue();
        }
    }

    static class PublishState implements State{

        @Override
        public void acceptOrderEvent(Context context) {
            //把当前状态设置为  NotPayState。。。
            //至于应该变成哪个状态，有流程图来决定
            context.setState(new NotPayState());
        }

        @Override
        public void notPeopleAcceptEvent(Context context) {
            context.setState(new FeedBackState());
        }

        @Override
        public String getCurrentState() {
            return StateEnum.PUBLISHED.getValue();
        }
    }

    static class ReviewState implements State {

        @Override
        public void makePriceEvent(Context context) {
            context.setState(new PublishState());
        }

        @Override
        public String getCurrentState() {
            return StateEnum.REVIEWED.getValue();
        }

    }
}
