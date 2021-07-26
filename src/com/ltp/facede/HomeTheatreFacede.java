package com.ltp.facede;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/7/26 23:24
 */
public class HomeTheatreFacede {

    private final DvdPlayer dvdPlayer;
    private final Screen screen;

    public HomeTheatreFacede() {
        this.dvdPlayer = DvdPlayer.getInstance();
        this.screen = Screen.getInstance();
    }

    public void ready() {
        dvdPlayer.play();
        screen.down();
    }

    public void stop(){
        dvdPlayer.off();
        screen.up();
    }
}
