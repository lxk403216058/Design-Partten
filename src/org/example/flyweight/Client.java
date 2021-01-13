package org.example.flyweight;

public class Client {
    public static void main(String[] args) {
        //创建一个工厂
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        //客户要一个以新闻形式发布的网站
        WebSite webSite1 = webSiteFactory.getWebSiteCategory("新闻");
        webSite1.use(new User("tom"));

        //客户要一个以博客形式发布的网站
        WebSite webSite2 = webSiteFactory.getWebSiteCategory("博客");
        webSite2.use(new User("jackey"));

        //客户要一个以博客形式发布的网站
        WebSite webSite3 = webSiteFactory.getWebSiteCategory("博客");
        webSite3.use(new User("simth"));

        //客户要一个以博客形式发布的网站
        WebSite webSite4 = webSiteFactory.getWebSiteCategory("博客");
        webSite4.use(new User("king"));

        System.out.println(webSiteFactory.getWebSiteCont());
    }
}
