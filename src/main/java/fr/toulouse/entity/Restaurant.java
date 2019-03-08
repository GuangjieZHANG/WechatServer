package fr.toulouse.entity;

import java.awt.*;
import java.util.List;

public class Restaurant {

    private Integer id; // PK
    private String name;
    private byte[] image; // 餐馆头像
    private byte[] bgimage; // 餐馆背景图
    private byte[] qrcode; // 餐馆二维码
    private String address;
    private String description;
    private String telephone;
    private List<Plat> plats;

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

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public byte[] getBgimage() {
        return bgimage;
    }

    public void setBgimage(byte[] bgimage) {
        this.bgimage = bgimage;
    }

    public byte[] getQrcode() {
        return qrcode;
    }

    public void setQrcode(byte[] qrcode) {
        this.qrcode = qrcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public List<Plat> getPlats() {
        return plats;
    }

    public void setPlats(List<Plat> plats) {
        this.plats = plats;
    }
}
