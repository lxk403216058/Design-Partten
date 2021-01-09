package org.example.singleton.type3;

//懒汉式（线程不安全）懒加载，有潜在风险，实际开发不能使用
public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println("singleton.hashCode"+singleton.hashCode());
        System.out.println("singleton1.hashCode"+singleton1.hashCode());
    }
}

class Singleton{
    private static Singleton instance;

    private Singleton(){}

    //提供一个静态的公用方法，当使用到该方法时，才去创建instance
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
