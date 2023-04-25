package com.metrics.socialla.metricssocial.controllers;

public class UserClass {
    private Integer id;
    private String name;
    private Integer twitterid;
    public Integer getTwitterid() {
        return twitterid;
    }
    public void setTwitterid(Integer twitterid) {
        this.twitterid = twitterid;
    }
    public UserClass(Integer twitterid) {
        this.twitterid = twitterid;
    }
    public UserClass(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "UserClass [id=" + id + ", name=" + name + ", twitterid=" + twitterid + "]";
    }
}
