package fr.toulouse.entity;

import java.awt.*;
import java.util.List;

public class Plat {

    private Integer id; // PK
    private String name;
    private Integer restaurantId; // FK 标记菜属于哪一家餐厅
    private Image image;
    private double price;
    private String description;
    private Integer aimer;
    private boolean isSpecial;
    private List<PlatTag> tags;

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

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAimer() {
        return aimer;
    }

    public void setAimer(Integer aimer) {
        this.aimer = aimer;
    }

    public boolean getIsSpecial() {
        return isSpecial;
    }

    public void setIsSpecial(boolean special) {
        isSpecial = special;
    }

    public List<PlatTag> getTags() {
        return tags;
    }

    public void setTags(List<PlatTag> tags) {
        this.tags = tags;
    }
}
