package com.xdclass.service;
/**
 * @Description: ${todo}
 * @author wll
 * @date 2020/7/5 11:34
 */

import com.xdclass.domain.Video;

/**
 *
 **/
public interface VideoService {
    int save(Video video);

    Video findById(int id);
}
