package com.hand.web.entity;

import java.io.Serializable;

/**
 * (Blog)实体类
 *
 * @author Stewart
 * @since 2022-01-10 19:22:02
 */
public class Blog implements Serializable {
    private static final long serialVersionUID = 545453505811054786L;
    /**
    * 博客id
    */
    private Integer id;
    /**
    * 博客用户名
    */
    private String blogName;
    /**
    * 博客日期
    */
    private String blogDate;
    /**
    * 博客图片
    */
    private String bolgPricture;
    /**
    * 博客内容
    */
    private String blogContext;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public String getBlogDate() {
        return blogDate;
    }

    public void setBlogDate(String blogDate) {
        this.blogDate = blogDate;
    }

    public String getBolgPricture() {
        return bolgPricture;
    }

    public void setBolgPricture(String bolgPricture) {
        this.bolgPricture = bolgPricture;
    }

    public String getBlogContext() {
        return blogContext;
    }

    public void setBlogContext(String blogContext) {
        this.blogContext = blogContext;
    }

}