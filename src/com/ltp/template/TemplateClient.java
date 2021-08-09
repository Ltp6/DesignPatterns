package com.ltp.template;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/9 23:53
 */
public class TemplateClient {

    public static void main(String[] args) {
        AbstractSoyMilk soyMilk = new RedBeanSoyMilk();
        soyMilk.make();
        System.out.println("=================");
        AbstractSoyMilk soyMilk1 = new GreenBeanSoyMilk();
        soyMilk1.make();
        System.out.println("=======原生豆浆======");
        AbstractSoyMilk soyMilk2 = new ProtistSoyMilk();
        soyMilk2.make();
    }
}
