package com.onlineStroe.enty;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/11/14.
 */
public class User implements Serializable {
    private String password;
    private String name;
    private Date login_Time;
    private Date createTime;
    private Date updateTime;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLogin_Time() {
        return login_Time;
    }

    public void setLogin_Time(Date login_Time) {
        this.login_Time = login_Time;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
