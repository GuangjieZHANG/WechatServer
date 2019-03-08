package fr.toulouse.entity;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;

public class House {

    private Integer id; // PK
    private byte[] image1;
    private byte[] image2;
    private byte[] image3;
    private Integer owner; // FK 发布者
    private String title;
    private String description;
    private String location;
    private double surface;
    private double price; //月租金
    private Date start; //最早开始时间
    private Boolean isLong;//true => 长租  false => 短租
    private Boolean isShared;
    private String locationtag;
    private String traffictag;
    // 联系人联系方式
    private String contactName;
    private String contactNum;
    private String contactWechat;

    private Integer orders;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public byte[] getImage1() {
        return image1;
    }

    public void setImage1(byte[] image1) {
        this.image1 = image1;
    }

    public byte[] getImage2() {
        return image2;
    }

    public void setImage2(byte[] image2) {
        this.image2 = image2;
    }

    public byte[] getImage3() {
        return image3;
    }

    public void setImage3(byte[] image3) {
        this.image3 = image3;
    }

    public Integer getOwner() {
        return owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public Boolean getShared() {
        return isShared;
    }

    public void setShared(Boolean shared) {
        isShared = shared;
    }

    public String getLocationtag() {
        return locationtag;
    }

    public void setLocationtag(String locationtag) {
        this.locationtag = locationtag;
    }

    public String getTraffictag() {
        return traffictag;
    }

    public void setTraffictag(String traffictag) {
        this.traffictag = traffictag;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Boolean getLong() {
        return isLong;
    }

    public void setLong(Boolean aLong) {
        isLong = aLong;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getContactWechat() {
        return contactWechat;
    }

    public void setContactWechat(String contactWechat) {
        this.contactWechat = contactWechat;
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }
}
