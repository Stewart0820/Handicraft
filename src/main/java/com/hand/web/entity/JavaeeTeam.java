package com.hand.web.entity;

import java.io.Serializable;

/**
 * 开发团队表(JavaeeTeam)实体类
 *
 * @author Stewart
 * @since 2022-01-10 19:22:10
 */
public class JavaeeTeam implements Serializable {
    private static final long serialVersionUID = 428820010044190104L;
    
    private Long teamId;
    
    private String teamDesc;
    
    private String teamIcon;
    
    private String teamName;
    
    private String teamSlogen;
    
    private String teamState;
    
    private Object createTime;
    
    private String createUser;
    
    private Object updateTime;
    
    private String updateUser;
    
    private Integer deleted;
    
    private Integer version;
    
    private String teamCity;


    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public String getTeamDesc() {
        return teamDesc;
    }

    public void setTeamDesc(String teamDesc) {
        this.teamDesc = teamDesc;
    }

    public String getTeamIcon() {
        return teamIcon;
    }

    public void setTeamIcon(String teamIcon) {
        this.teamIcon = teamIcon;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamSlogen() {
        return teamSlogen;
    }

    public void setTeamSlogen(String teamSlogen) {
        this.teamSlogen = teamSlogen;
    }

    public String getTeamState() {
        return teamState;
    }

    public void setTeamState(String teamState) {
        this.teamState = teamState;
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

    public String getTeamCity() {
        return teamCity;
    }

    public void setTeamCity(String teamCity) {
        this.teamCity = teamCity;
    }

}