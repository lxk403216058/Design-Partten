package org.example.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {
    //维护一个目标对象

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //返回一个代理对象， 是targt对象的代理对象

    public Object getProxyInstance() {
        //1. 创建一个工具类
        Enhancer enhancer = new Enhancer();
        //2. 设置父类
        enhancer.setSuperclass(target.getClass());
        //3. 设置回调函数
        enhancer.setCallback(this);
        //4. 创建子类对象，即地代理对象
        return enhancer.create();
    }

    //重写 intercept  方法，会调用莫表对象的方法

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib代理模式开始 .....");
        Object invoke = method.invoke(target, args);
        System.out.println("Cglib代理模式提交 .....");
        return invoke;
    }
}
