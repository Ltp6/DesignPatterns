package com.ltp.strategy;

import java.util.Objects;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/19 22:24
 */
public abstract class AbstractDuck {

    /**
     * 策略接口
     */
   FlyBehavior flyBehavior;

    public void fly(){
        if(Objects.nonNull(flyBehavior)){
            flyBehavior.fly();
        }
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    protected abstract void display();
}
