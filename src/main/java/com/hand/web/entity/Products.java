package com.hand.web.entity;

import java.io.Serializable;

/**
 * (Products)实体类
 *
 * @author Stewart
 * @since 2022-01-10 19:22:12
 */
public class Products implements Serializable {
    private static final long serialVersionUID = -54162113877538914L;
    /**
    * 新品id
    */
    private Integer newId;
    /**
    * 新品名
    */
    private String newName;
    /**
    * 新品介绍
    */
    private String newIntro;
    /**
    * 新品插图
    */
    private String newImg;
    /**
    * 新品价格
    */
    private Double newPrice;


    public Integer getNewId() {
        return newId;
    }

    public void setNewId(Integer newId) {
        this.newId = newId;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public String getNewIntro() {
        return newIntro;
    }

    public void setNewIntro(String newIntro) {
        this.newIntro = newIntro;
    }

    public String getNewImg() {
        return newImg;
    }

    public void setNewImg(String newImg) {
        this.newImg = newImg;
    }

    public Double getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(Double newPrice) {
        this.newPrice = newPrice;
    }

}