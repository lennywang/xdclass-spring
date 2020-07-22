package com.xdclass.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 **/
public class JdkProxy implements InvocationHandler {

    //目标类
    private Object targetObject;

    public Object newProxyInstance(Object targetObject) {
        this.targetObject = targetObject;

        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = null;
        try {
            System.out.println("通过JDK动态代理调用 " + method.getName() + " ,打印日志 begin");
            method.invoke(targetObject, args);
            System.out.println("通过JDK动态代理调用 " + method.getName() + " ,打印日志 end");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
