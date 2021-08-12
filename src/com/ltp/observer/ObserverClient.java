package com.ltp.observer;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/12 23:55
 */
public class ObserverClient {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        //创建观察者
        CurrentWeather currentWeather = new CurrentWeather();

        BaiduWeather baiduWeather = new BaiduWeather();

        //注册观察者
        weatherData.registerObserver(currentWeather);
        weatherData.registerObserver(baiduWeather);

        //设置数据
        weatherData.setData(35,68);

        weatherData.removeObserver(currentWeather);
        //设置数据
        weatherData.setData(40,68);
    }
}
