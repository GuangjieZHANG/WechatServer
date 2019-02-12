package fr.toulouse.entity;

import java.awt.*;

public class Object {

    private Integer id; // PK
    private Integer owner; // FK 发布者
    private String name;
    private Image image;
    private String discription;
    private double price;
    // 联系人联系方式
    private String contactName;
    private String contactNum;
    private String contactWechat;
    private Integer aimer;
    private ObjectTag tag;

}
