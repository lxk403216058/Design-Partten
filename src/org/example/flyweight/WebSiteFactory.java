package org.example.flyweight;

//网站工厂类，根据需要发返回一个网站

import java.util.HashMap;

public class WebSiteFactory {

    //集合，充当池的作用
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    //根据网站的类型，返回一个网站，如果没有就创建一个网站，并放入到池中，并返回

    public WebSite getWebSiteCategory(String type) {
        if (!pool.containsKey(type)) {
            //创建一个网站，并放入到池中
            pool.put(type, new ConcreteWebSite(type));
        }
        return (WebSite) pool.get(type);
    }

    //获取网站分类的总数（池中有多少个网站资源）

    public int getWebSiteCont() {
        return pool.size();
    }

}
