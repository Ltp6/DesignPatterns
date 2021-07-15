package com.ltp.adapter.object;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2020/8/26 23:32
 * @Version： 1.0
 */
public class Phone {

    public void charge(Voltage5 voltage5){
        if(voltage5.output5()==5){
            System.out.println("输出电压为5v,可以充电");
        }else{
            System.out.println("不能充电");
        }
    }
}
