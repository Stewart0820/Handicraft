package com.hand.web.entity;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author Stewart
 * @since 2022-01-10 14:46:08
 */
public class User implements Serializable {
    private static final long serialVersionUID = 922634049856161644L;
    /**
    * 用户id，自动增长
    */
    private Integer userId;
    /**
    * 用户名
    */
    private String userName;
    /**
    * 用户密码
    */
    private String userPwd;
    /**
    * 用户邮箱
    */
    private String userEmail;
    /**
    * 用户地址
    */
    private String userAddr;
    /**
    * 用户电话
    */
    private String userPhone;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

}