package com.ltp.facede;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/7/26 23:23
 */
public class Screen {

    private Screen() {

    }

    private volatile static Screen instance = null;

    public static Screen getInstance() {
        if (instance == null) {
            synchronized (Screen.class) {
                if (instance == null) {
                    instance = new Screen();
                }
            }
        }
        return instance;
    }

    public void up(){
        System.out.println("Screen up");
    }


    public void down(){
        System.out.println("Screen down");
    }

}
