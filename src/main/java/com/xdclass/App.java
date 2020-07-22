package com.xdclass;
/**
 * @Description: ${todo}
 * @author wll
 * @date 2020/7/5 11:05
 */

import com.xdclass.domain.Video;
import com.xdclass.domain.VideoOrder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 **/
@SpringBootApplication
public class App {
    public static void main(String[] args) {

        SpringApplication.run(App.class, args);

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Video video = (Video) applicationContext.getBean("video");
//        System.out.println(video.getTitle());
//
//        VideoOrder videoOrder = (VideoOrder) applicationContext.getBean("videoOrder");
//        System.out.println(videoOrder.getVideo().getTitle());
//        System.out.println(videoOrder);
    }
}
