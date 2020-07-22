package com.xdclass.proxy;
/**
 * @Description: ${todo}
 * @author wll
 * @date 2020/7/22 23:43
 */
public interface PayService {
    /**
     * @Description: 支付回调
     * @param
     * @return
    */
    String callback(String outTradeNo);

    /**
     * @Description: 下单
     * @param
     * @return int
    */
    int save(int userId,int productId);
}
