package com.ltp.observer;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/12 23:37
 */
public interface Observer {

    /**
     * 更新天气情况
     * @param temperature 温度
     * @param humidity 湿度
     */
    void update(double temperature, double humidity);
}
