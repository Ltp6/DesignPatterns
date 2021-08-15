package com.ltp.mediator;

/**
 * @Description:
 * @Author: James.Lee
 * @Date: 2021/8/15 23:23
 */
public class Tv extends AbstractColleague{


    public Tv(AbstractMediator mediator, String name) {
        super(mediator, name);
    }

    public void start(){
        System.out.println("开始放电视");
    }

    public void stop(){
        System.out.println("关机");
    }
}
