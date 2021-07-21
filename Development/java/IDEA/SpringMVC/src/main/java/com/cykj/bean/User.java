package com.cykj.bean;

/**
 * @version 1.0
 * @author: OldStreetHong
 * @date: 2021/7/10 13:28
 * @desc:
 */
public class User {

    private String stuacc;
    private String stuidcard;

    public User() {

    }

    public User(String stuacc, String stuidcard) {
        this.stuacc = stuacc;
        this.stuidcard = stuidcard;
    }

    public String getStuacc() {
        return stuacc;
    }

    public void setStuacc(String stuacc) {
        this.stuacc = stuacc;
    }

    public String getStuidcard() {
        return stuidcard;
    }

    public void setStuidcard(String stuidcard) {
        this.stuidcard = stuidcard;
    }

    @Override
    public String toString() {
        return "User{" +
                "stuacc='" + stuacc + '\'' +
                ", stuidcard='" + stuidcard + '\'' +
                '}';
    }
}
