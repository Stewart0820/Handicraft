package com.hand.web.entity;

import java.io.Serializable;

/**
 * (Introduction)实体类
 *
 * @author Stewart
 * @since 2022-01-10 19:22:08
 */
public class Introduction implements Serializable {
    private static final long serialVersionUID = -78586885140740920L;
    /**
    * 简介id
    */
    private Integer introId;
    /**
    * 简介标题
    */
    private String introTitle;
    /**
    * 简介内容
    */
    private String introContent;
    /**
    * 简介插图
    */
    private String introImg;


    public Integer getIntroId() {
        return introId;
    }

    public void setIntroId(Integer introId) {
        this.introId = introId;
    }

    public String getIntroTitle() {
        return introTitle;
    }

    public void setIntroTitle(String introTitle) {
        this.introTitle = introTitle;
    }

    public String getIntroContent() {
        return introContent;
    }

    public void setIntroContent(String introContent) {
        this.introContent = introContent;
    }

    public String getIntroImg() {
        return introImg;
    }

    public void setIntroImg(String introImg) {
        this.introImg = introImg;
    }

}