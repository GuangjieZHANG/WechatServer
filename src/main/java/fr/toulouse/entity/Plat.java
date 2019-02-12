package fr.toulouse.entity;

import java.awt.*;
import java.util.ArrayList;

public class Plat {

    private Integer id; // PK
    private Integer restaurantId; // FK 标记菜属于哪一家餐厅
    private Image image;
    private double price;
    private String discrition;
    private Integer aimer;
    private ArrayList<PlatTag> tags;

}
