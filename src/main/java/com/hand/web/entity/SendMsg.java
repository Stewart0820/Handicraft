package com.hand.web.entity;

import java.io.Serializable;

/**
 * (SendMsg)实体类
 *
 * @author Stewart
 * @since 2022-01-10 19:22:12
 */
public class SendMsg implements Serializable {
    private static final long serialVersionUID = -37333664317907919L;
    /**
    * ID
    */
    private Integer cId;
    /**
    * 姓名
    */
    private String cName;
    /**
    * 电话号码
    */
    private String cPhone;
    /**
    * 邮件
    */
    private String cEmail;
    /**
    * 主题
    */
    private String cSubject;
    /**
    * 短信
    */
    private String cMessage;


    public Integer getCId() {
        return cId;
    }

    public void setCId(Integer cId) {
        this.cId = cId;
    }

    public String getCName() {
        return cName;
    }

    public void setCName(String cName) {
        this.cName = cName;
    }

    public String getCPhone() {
        return cPhone;
    }

    public void setCPhone(String cPhone) {
        this.cPhone = cPhone;
    }

    public String getCEmail() {
        return cEmail;
    }

    public void setCEmail(String cEmail) {
        this.cEmail = cEmail;
    }

    public String getCSubject() {
        return cSubject;
    }

    public void setCSubject(String cSubject) {
        this.cSubject = cSubject;
    }

    public String getCMessage() {
        return cMessage;
    }

    public void setCMessage(String cMessage) {
        this.cMessage = cMessage;
    }

}