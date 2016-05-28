package com.hyolee.blog.domain;

import java.util.Date;

/**
 * 博客的分类，不做太复杂，只做一级分类
 * Created by Administrator on 2016/5/28.
 */
public class Category {

    /**
     * 分类id
     */
    private Integer cid;
    /**
     * 分类名称
     */
    private String name;
    /**
     * 分类状态，0表示禁用，1表示启用
     */
    private Integer status;
    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 备注
     */
    private String description;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
