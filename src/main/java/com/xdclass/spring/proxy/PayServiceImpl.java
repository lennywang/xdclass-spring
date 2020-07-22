package com.xdclass.spring.proxy;

import java.text.MessageFormat;

/**
 *
 **/
public class PayServiceImpl implements PayService {
    public String callback(String tradeNo) {
        System.out.println(MessageFormat.format("目标类：{0} 回调方法：{1}", "PayServiceImpl", "callback"));
        return tradeNo;
    }

    public int save(int userId, int productId) {
        System.out.println(MessageFormat.format("目标类：{0} 回调方法：{1}", "PayServiceImpl", "save"));
        return 1;
    }
}
