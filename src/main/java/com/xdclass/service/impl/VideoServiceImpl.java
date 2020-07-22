package com.xdclass.service.impl;
/**
 * @Description: ${todo}
 * @author wll
 * @date 2020/7/21 22:59
 */

import com.xdclass.domain.Video;
import com.xdclass.service.VideoService;

/**
 *
 **/
public class VideoServiceImpl implements VideoService {

    @Override
    public int save(Video video) {

        System.out.println("保存video");

        return 1;
    }

    @Override
    public Video findById(int id) {

        System.out.println("根据id找视频");

        return new Video();
    }
}
