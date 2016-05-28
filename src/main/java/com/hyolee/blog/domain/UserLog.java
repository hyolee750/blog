package com.hyolee.blog.domain;

import java.util.Date;

/**
 * 用户日志行为记录类
 * 该日志将会记录用户的各种行为的记录
 * 用户注册，用户登录，用户浏览，用户退出
 * Created by Administrator on 2016/5/28.
 */
public class UserLog {

    /**
     * 主键id
     */
    private Integer id;
    /**
     * 用户行为类型
     * login:登录
     * register:注册
     * logout:退出
     * visit:浏览
     */
    private String action;
    /**
     * 访问的是哪个路径
     */
    private String url;
    /**
     * 如果是已登录用户，会有用户名
     */
    private String username;
    /**
     * 如果用户是访客，可以保存该用户的sessionId作为用户名
     */
    private String sessionId;
    /**
     * 创建时间，也就是动作发生的时间
     */
    private Date createTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
