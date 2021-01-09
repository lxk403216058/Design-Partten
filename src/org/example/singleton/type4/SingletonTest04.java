package org.example.singleton.type4;

//懒汉式线程安全，但是效率低，每一次调用getInstance都要同步
public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }
}
class Singleton{
    private static Singleton instance;

    private Singleton(){}

    //用线程同步方法解决线程安全问问题
    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
