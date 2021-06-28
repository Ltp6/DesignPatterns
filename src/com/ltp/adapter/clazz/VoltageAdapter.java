package com.ltp.adapter.clazz;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2020/8/26 23:30
 * @Version： 1.0
 */
public class VoltageAdapter extends Voltage220 implements Voltage5 {
    @Override
    public int output5() {
        int target = output() / 44;
        System.out.println("转化电压"+target+"v");
        return target;
    }
}
