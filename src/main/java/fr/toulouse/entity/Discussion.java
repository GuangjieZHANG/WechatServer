package fr.toulouse.entity;

import java.util.ArrayList;

public class Discussion {

    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Integer owner;
    private String contactName;
    private String contactNum;
    private String contactWechat;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getOwner() {
        return owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
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
}
