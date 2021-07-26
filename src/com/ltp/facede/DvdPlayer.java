package com.ltp.facede;

/**
 * @Description: Double check single
 * @Author: Ltp
 * @Date: 2021/7/26 23:18
 */
public class DvdPlayer {

    private DvdPlayer() {

    }

    private volatile static DvdPlayer instance = null;

    public static DvdPlayer getInstance() {
        if (instance == null) {
            synchronized (DvdPlayer.class) {
                if (instance == null) {
                    instance = new DvdPlayer();
                }
            }
        }
        return instance;
    }

    public void on() {
        System.out.println("DVD on");
    }


    public void off() {
        System.out.println("DVD off");
    }


    public void play() {
        System.out.println("DVD play");
    }

}
