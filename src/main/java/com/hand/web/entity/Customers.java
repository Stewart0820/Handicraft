package com.hand.web.entity;

import java.io.Serializable;

/**
 * (Customers)实体类
 *
 * @author Stewart
 * @since 2022-01-10 19:22:06
 */
public class Customers implements Serializable {
    private static final long serialVersionUID = 548914499530539844L;
    /**
    * ID
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
    * 内容
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}