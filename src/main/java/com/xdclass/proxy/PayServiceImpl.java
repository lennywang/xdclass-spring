package com.xdclass.proxy;

/**
 * @Description: ${todo}
 * @author wll
 * @date 2020/7/22 23:45
 */
public class PayServiceImpl implements PayService {
    @Override
    public String callback(String outTradeNo) {
        System.out.println("目标类 PayServiceImpl 回调方法 callback");
        return outTradeNo;
    }

    @Override
    public int save(int userId, int productId) {
        System.out.println("目标类 PayServiceImpl 回调方法 save");
        return productId;
    }
}
