package com.ltp.adapter.object;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2020/8/26 23:30
 * @Version： 1.0
 */
public class VoltageAdapter implements Voltage5 {

    /**
     * 关联关系中的聚合
     */
    private final Voltage220 voltage220;

    /**
     * 通过构造器初始化
     * @param voltage220
     */
    public VoltageAdapter(Voltage220 voltage220) {
        this.voltage220 = voltage220;
    }

    @Override
    public int output5() {
        int output = voltage220.output();
        int target = output / 44;
        System.out.println("转化电压"+target+"v");
        return target;
    }
}
