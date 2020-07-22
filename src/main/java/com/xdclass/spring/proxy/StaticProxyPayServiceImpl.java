package com.xdclass.spring.proxy;

import java.text.MessageFormat;

/**
 *
 **/
public class StaticProxyPayServiceImpl implements PayService {

    private PayService payService;

    public StaticProxyPayServiceImpl(PayService payService) {
        this.payService = payService;
    }

    public String callback(String tradeNo) {
        System.out.println(MessageFormat.format("{0} {1} begin", "StaticProxyPayServiceImpl", "callback"));
        String result = payService.callback(tradeNo);
        System.out.println(MessageFormat.format("{0} {1} end", "StaticProxyPayServiceImpl", "callback"));
        return result;
    }

    public int save(int userId, int productId) {
        System.out.println(MessageFormat.format("{0} {1} begin", "StaticProxyPayServiceImpl", "save"));
        int id = payService.save(userId, productId);
        System.out.println(MessageFormat.format("{0} {1} end", "StaticProxyPayServiceImpl", "save"));
        return id;
    }
}
