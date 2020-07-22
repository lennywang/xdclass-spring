package com.xdclass.controller;
/**
 * @Description: ${todo}
 * @author wll
 * @date 2020/7/5 16:24
 */

import com.secbro.msg.MsgService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *
 **/
@RestController
public class HelloWordController {
    @Resource
    private MsgService msgService;

    @RequestMapping("/sendMsg")
    public String sendMsg(){
        msgService.sendMsg("测试消息");

        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");

        return "1111";
    }
}
