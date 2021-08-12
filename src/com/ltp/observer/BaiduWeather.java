package com.ltp.observer;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/12 23:59
 */
public class BaiduWeather implements Observer {
    private Double temperature;
    private Double humidity;

    @Override
    public void update(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("百度天气：" + temperature + "℃\t" + humidity + "%");
    }
}
