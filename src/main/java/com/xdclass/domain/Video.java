package com.xdclass.domain;
/**
 * @Description: ${todo}
 * @author wll
 * @date 2020/7/5 11:01
 */

/**
 *
 **/
public class Video {

    private int id;

    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
