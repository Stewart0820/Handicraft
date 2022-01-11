package com.hand.web.entity;

import java.io.Serializable;

/**
 * Our Expert Artists(Artists)实体类
 *
 * @author Stewart
 * @since 2022-01-10 19:22:00
 */
public class Artists implements Serializable {
    private static final long serialVersionUID = -39628564531203722L;
    /**
    * id
    */
    private Integer id;
    /**
    * 图片
    */
    private String image;
    /**
    * 姓名
    */
    private String name;
    /**
    * 职位
    */
    private String position;
    /**
    * 简介内容
    */
    private String content;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}