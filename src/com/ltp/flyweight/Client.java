package com.ltp.flyweight;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/7/26 23:40
 */
public class Client {

    public static void main(String[] args) {
        WebsiteFactory websiteFactory = new WebsiteFactory();
        AbstractWebsite website1 = websiteFactory.getWebsite("新闻");
        website1.use("ltp");
        AbstractWebsite website2 = websiteFactory.getWebsite("博客");
        website2.use("ltp");
        AbstractWebsite website3 = websiteFactory.getWebsite("博客");
        website3.use("jugg");
        System.out.println(websiteFactory.getCount());
    }
}
