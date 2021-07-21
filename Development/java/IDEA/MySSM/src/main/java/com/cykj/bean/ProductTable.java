package com.cykj.bean;


public class ProductTable {
    private String ID;
    private String name;
    private String number;
    private double stattingPrice;
    private String type;
    private String img;
    private String brief;

    public ProductTable(){

    }

    public ProductTable(String ID, String name, String number, double stattingPrice, String type, String img, String brief) {
        this.ID = ID;
        this.name = name;
        this.number = number;
        this.stattingPrice = stattingPrice;
        this.type = type;
        this.img = img;
        this.brief = brief;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getStattingPrice() {
        return stattingPrice;
    }

    public void setStattingPrice(double stattingPrice) {
        this.stattingPrice = stattingPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    @Override
    public String toString() {
        return "ProductTable{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", stattingPrice=" + stattingPrice +
                ", type='" + type + '\'' +
                ", img='" + img + '\'' +
                ", brief='" + brief + '\'' +
                '}';
    }
}
