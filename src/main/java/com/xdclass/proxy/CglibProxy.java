package com.xdclass.proxy;
/**
 * @Description: ${todo}
 * @author wll
 * @date 2020/7/22 23:30
 */

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 *
 **/
public class CglibProxy implements MethodInterceptor {

    private Object targetObject;

    public Object newProxyInstance(Object targetObject){
        this.targetObject=targetObject;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.targetObject.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }


    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object result=null;

        try {
            System.out.println("通过CGLIB动态代理调用 "+method.getName()+"，打印日志 begin");
            result=methodProxy.invokeSuper(o,args);
            System.out.println("通过CGLIB动态代理调用 "+method.getName()+"，打印日志 begin");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
