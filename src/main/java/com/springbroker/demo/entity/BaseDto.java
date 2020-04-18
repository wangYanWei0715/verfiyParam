package com.springbroker.demo.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 王延伟
 * @description TODO
 * @createTime $ $
 */

public class BaseDto implements Serializable {

    private static final long serialVersionUID = 5501852450494014608L;
    private String delStatus;
    /**
     * 创建者ID
     */
    private String createUserId;
    /**
     * 创建者姓名
     */
    private String createUsername;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改者ID
     */
    private String updateUserId;
    /**
     * 修改者姓名
     */
    private String updateUsername;
    /**
     * 修改时间
     */
    private Date updateTime;


    public String getDelStatus() {
        return delStatus;
    }


    public void setDelStatus(String delStatus) {
        this.delStatus = delStatus;
    }


    public String getCreateUserId() {
        return createUserId;
    }


    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }


    public String getCreateUsername() {
        return createUsername;
    }


    public void setCreateUsername(String createUsername) {
        this.createUsername = createUsername;
    }


    public Date getCreateTime() {
        return createTime;
    }


    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public String getUpdateUserId() {
        return updateUserId;
    }


    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }


    public String getUpdateUsername() {
        return updateUsername;
    }


    public void setUpdateUsername(String updateUsername) {
        this.updateUsername = updateUsername;
    }


    public Date getUpdateTime() {
        return updateTime;
    }


    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
