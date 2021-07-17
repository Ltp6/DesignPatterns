package com.ltp.bridge;

/**
 * @Description:
 * @Author: James.Lee
 * @Date: 2021/7/18 00:08
 */
public class VivoPhone implements Phone{
    @Override
    public void call() {
        System.out.println("Vivo打电话");
    }
}
