package com.ltp.bridge;

/**
 * @Description:
 * @Author: James.Lee
 * @Date: 2021/7/17 23:55
 */
public class BridgeClient {

    public static void main(String[] args) {
        System.out.println("=========直立小米手机========");
        UprightPhone xiaoMiUpright = new UprightPhone(new XiaoMiPhone());
        xiaoMiUpright.call();

        System.out.println("=========直立Vivo手机========");
        UprightPhone vivoUpright = new UprightPhone(new VivoPhone());
        vivoUpright.call();

        System.out.println("=========折叠Vivo手机========");
        FoldPhone vivoFold = new FoldPhone(new VivoPhone());
        vivoFold.call();
    }
}
