package org.example.singleton.type6;

//懒汉式3，双重检查，推荐使用，既保证了线程安全，效率较高
public class SingletonTest06 {
    public static void main(String[] args) {

    }
}

class Singleton{
    private static volatile Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class) {
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

