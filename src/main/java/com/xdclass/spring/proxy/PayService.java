package com.xdclass.spring.proxy;

public interface PayService {

    /**
     * 支付回调
     **/
    String callback(String tradeNo);

    /**
     * 下单
     **/
    int save(int userId, int productId);
}
