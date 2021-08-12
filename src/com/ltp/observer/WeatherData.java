package com.ltp.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/12 23:39
 */
public class WeatherData implements Subject {

    private Double temperature;
    private Double humidity;

    private final List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void setData(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity);
        }
    }
}
