package com.xdclass.aop;
/**
 * @Description: ${todo}
 * @author wll
 * @date 2020/7/21 22:51
 */


import java.time.LocalDateTime;

/**
 *
 **/
public class TimeHandler {

    public void printBefore(){
        System.out.println("printBefore 日志 time = "+ LocalDateTime.now().toString());
    }

    public void printAfter(){
        System.out.println("printAfter 日志 time = "+LocalDateTime.now().toString());
    }

}
