package com.xdclass.spring.proxy;

/**
 *
 **/
public class ProxyTest {
    public static void main(String[] args){
        //静态代理
        PayService payService = new PayServiceImpl();
        payService.save(1,2);

        PayService roxyPayService = new StaticProxyPayServiceImpl(new PayServiceImpl());
        roxyPayService.save(1,2);
        roxyPayService.callback("12");


    }
}
