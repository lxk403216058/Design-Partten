package org.example.proxy.dynamicproxy;

public class Client {
    public static void main(String[] args) {
        //创建目标对象
        ITeacherDao taget = new TeacherDao();

        //给目标对象，创建代理对象
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(taget).getProxyInstance();

        //proxyInstance=class com.sun.proxy.$Proxy0 内存中生成了代理对象
        System.out.println("proxyInstance=" + proxyInstance.getClass());
        //proxyInstance.teach();

        proxyInstance.sayHello("tom ");
    }
}
