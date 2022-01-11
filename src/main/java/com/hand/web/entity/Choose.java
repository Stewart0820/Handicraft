package com.hand.web.entity;

import java.io.Serializable;

/**
 * Why Choose Us(Choose)实体类
 *
 * @author Stewart
 * @since 2022-01-10 19:22:05
 */
public class Choose implements Serializable {
    private static final long serialVersionUID = 987967311109391125L;
    
    private Integer id;
    /**
    * 标题
    */
    private String title;
    /**
    * 内容
    */
    private String content;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}