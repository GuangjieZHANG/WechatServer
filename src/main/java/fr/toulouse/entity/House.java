package fr.toulouse.entity;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;

public class House {

    private Integer id; // PK
    private ArrayList<Image> images;
    private Integer owner; // FK 发布者
    private String name;
    private Image image;
    private String discription;
    private String location;
    private HouseTag tag;
    private double price; //月租金
    private Date start; //最早开始时间
    private Boolean type;//true => 长租  false => 短租
    // 联系人联系方式
    private String contactName;
    private String contactNum;
    private String contactWechat;


}
