package org.example.singleton.type8;

//使用枚举实现单例，避免了多线程问题，防止反序列化重新创建新的对象， 推荐使用
public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;

    }
}

enum Singleton{
    INSTANCE; //属性
    public void sayOK() {
        System.out.println("OK .....");
    }
}
