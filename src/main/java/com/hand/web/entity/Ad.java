package com.hand.web.entity;

import java.io.Serializable;

/**
 * (Ad)实体类
 *
 * @author Stewart
 * @since 2022-01-10 19:21:53
 */
public class Ad implements Serializable {
    private static final long serialVersionUID = -97993008914411337L;
    /**
    * 封面id
    */
    private Integer adId;
    /**
    * 封面图片
    */
    private String adImg;
    /**
    * 封面标题
    */
    private String adTitle;
    /**
    * 封面简介
    */
    private String adContent;


    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public String getAdImg() {
        return adImg;
    }

    public void setAdImg(String adImg) {
        this.adImg = adImg;
    }

    public String getAdTitle() {
        return adTitle;
    }

    public void setAdTitle(String adTitle) {
        this.adTitle = adTitle;
    }

    public String getAdContent() {
        return adContent;
    }

    public void setAdContent(String adContent) {
        this.adContent = adContent;
    }

}