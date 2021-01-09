package org.example.singleton.type7;

//使用静态内部类实现单例,推荐使用
public class SingletonTest07 {
    public static void main(String[] args) {

    }
}

class Singleton{
    private static Singleton instance;
    private Singleton(){}

    // 静态内部类在类装载时不会被装载，保证懒加载，装载类时是线程安全的
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    //
    public static Singleton getInstance(){
        instance = SingletonInstance.INSTANCE;
        return instance;
    }
}
