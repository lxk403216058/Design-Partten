package org.example.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    //维护一个目标对象

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //给目标对象生成一个代理对象

    public Object getProxyInstance() {
        //说明
        /*
        1. ClassLoader loader : 指定当前1目标对象使用的类加载器，获取加载器方法固定
        2. Class<?>[] interfaces : 目标对象实现的接口类型，使用繁星方法确认类型
        3. InvocationHandler h : 事情处理，执行目标对象的犯法时，会触发事情处理器方法，
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK代理开始 .....");
                        //反射机制调用目标对象的方法
                        Object invoke = method.invoke(target, args);
                        System.out.println("JDK代理提交 .....");
                        return invoke;
                    }
                });
    }
}
