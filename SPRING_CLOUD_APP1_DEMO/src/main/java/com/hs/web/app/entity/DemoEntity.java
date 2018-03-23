package com.hs.web.app.entity;

/**
 * Project ： SPRING_CLOUD_EUREKA_DEMO
 * PackageName ： com.hs.web.app.entity
 * Author ： caijl
 * Date ： 2018/1/5
 * Time ： 14:14
 * Description :
 * 系统版本 ： 1.0
 */
public class DemoEntity {

    private String name;
    private String account;
    private String userNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }
}
