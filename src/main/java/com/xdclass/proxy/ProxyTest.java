package com.xdclass.proxy;
/**
 * @Description: ${todo}
 * @author wll
 * @date 2020/7/22 23:46
 */

/**
 *
 **/
public class ProxyTest {
    public static void main(String[] args) {
        //PayService payService = new PayServiceImpl();
        //payService.callback("jskfdlaklfds");

        //PayService payService = new StaticProxy(new PayServiceImpl());
        //payService.save(23,32);
        //payService.callback("kdslfjlkfds");

        //JdkProxy
        JdkProxy jdkProxy = new JdkProxy();
        PayService payService = (PayService) jdkProxy.newProxyInstance(new PayServiceImpl());
        payService.callback("alkdfjlkdsafkdls");
        payService.save(2,33232);

        //CglibProxy
        //CglibProxy cglibProxy = new CglibProxy();
        //PayService payService = (PayService) cglibProxy.newProxyInstance(new PayServiceImpl());
        //payService.save(23,2434);
        //payService.callback("123424332");
    }
}
