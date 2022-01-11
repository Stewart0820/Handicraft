package com.hand.web.entity;

import java.io.Serializable;

/**
 * 开发人员信息表(JaveeeMember)实体类
 *
 * @author Stewart
 * @since 2022-01-10 19:22:11
 */
public class JaveeeMember implements Serializable {
    private static final long serialVersionUID = -46037372015464787L;
    
    private Long mId;
    
    private String mFaceImg;
    
    private String mGrade;
    
    private Long mItemId;
    
    private String mJob;
    
    private String mName;
    
    private String mNumber;
    
    private String mSkill;
    
    private String mStatus;
    
    private Object createTime;
    
    private String createUser;
    
    private Object updateTime;
    
    private String updateUser;
    
    private Integer deleted;
    
    private Integer version;


    public Long getMId() {
        return mId;
    }

    public void setMId(Long mId) {
        this.mId = mId;
    }

    public String getMFaceImg() {
        return mFaceImg;
    }

    public void setMFaceImg(String mFaceImg) {
        this.mFaceImg = mFaceImg;
    }

    public String getMGrade() {
        return mGrade;
    }

    public void setMGrade(String mGrade) {
        this.mGrade = mGrade;
    }

    public Long getMItemId() {
        return mItemId;
    }

    public void setMItemId(Long mItemId) {
        this.mItemId = mItemId;
    }

    public String getMJob() {
        return mJob;
    }

    public void setMJob(String mJob) {
        this.mJob = mJob;
    }

    public String getMName() {
        return mName;
    }

    public void setMName(String mName) {
        this.mName = mName;
    }

    public String getMNumber() {
        return mNumber;
    }

    public void setMNumber(String mNumber) {
        this.mNumber = mNumber;
    }

    public String getMSkill() {
        return mSkill;
    }

    public void setMSkill(String mSkill) {
        this.mSkill = mSkill;
    }

    public String getMStatus() {
        return mStatus;
    }

    public void setMStatus(String mStatus) {
        this.mStatus = mStatus;
    }

    public Object getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Object createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Object getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Object updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

}