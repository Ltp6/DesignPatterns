package com.ltp.mediator;

/**
 * @Description:
 * @Author: James.Lee
 * @Date: 2021/8/15 23:32
 */
public class MediatorClient {

    public static void main(String[] args) {
        AbstractMediator mediator = new ConcreteMediator();

        AbstractColleague alarm = new Alarm(mediator, "alarm");
        AbstractColleague tv = new Tv(mediator, "tv");
        mediator.register(alarm.getName(),alarm);
        mediator.register(tv.getName(),tv);


        alarm.sendMessage(0);
        System.out.println("===============");
        alarm.sendMessage(1);
    }
}
