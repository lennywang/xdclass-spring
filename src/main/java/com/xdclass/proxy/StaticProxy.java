package com.xdclass.proxy;
/**
 * @Description: ${todo}
 * @author wll
 * @date 2020/7/23 0:02
 */

/**
 *
 **/
public class StaticProxy implements PayService {

    private PayService payService;

    public StaticProxy(PayService payService) {
        this.payService = payService;
    }

    @Override
    public String callback(String outTradeNo) {
        System.out.println("StaticProxy callback begin");
        String result = payService.callback(outTradeNo);
        System.out.println("StaticProxy callback end");
        return result;
    }

    @Override
    public int save(int userId, int productId) {
        System.out.println("StaticProxy save begin");
        int id = payService.save(userId, productId);
        System.out.println("StaticProxy save end");
        return id;
    }
}
