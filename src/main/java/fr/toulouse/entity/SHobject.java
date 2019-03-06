package fr.toulouse.entity;

import java.awt.*;

public class SHobject {

    private Integer id; // PK
    private Integer owner; // FK 发布者
    private String name;
    private byte[] image;
    private String discription;
    private double price;
    // 联系人联系方式
    private String contactName;
    private String contactNum;
    private String contactWechat;
    private Integer aimer;
    private ObjectTag tag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOwner() {
        return owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

    public Integer getAimer() {
        return aimer;
    }

    public void setAimer(Integer aimer) {
        this.aimer = aimer;
    }

    public ObjectTag getTag() {
        return tag;
    }

    public void setTag(ObjectTag tag) {
        this.tag = tag;
    }
}
