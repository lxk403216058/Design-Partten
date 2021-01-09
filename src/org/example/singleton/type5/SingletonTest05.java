package org.example.singleton.type5;

//懒汉式2，同步代码块，无法保证单例，实际开发不能使用
public class SingletonTest05 {
    public static void main(String[] args) {

    }
}
class Singleton{
    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
