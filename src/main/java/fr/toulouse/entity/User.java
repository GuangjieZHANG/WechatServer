package fr.toulouse.entity;

import java.awt.*;
import java.util.ArrayList;

public class User {

    private int id;
    private String name;
    private String openid;
    private ArrayList<SHobject> aimerSHobjects;
    private ArrayList<Plat> aimerPlats;
    private ArrayList<SHobject> ownSHobjects;
    private ArrayList<House> ownHouses;
    private ArrayList<Discussion> ownDiscussions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public ArrayList<SHobject> getAimerSHobjects() {
        return aimerSHobjects;
    }

    public void setAimerSHobjects(ArrayList<SHobject> aimerSHobjects) {
        this.aimerSHobjects = aimerSHobjects;
    }

    public ArrayList<Plat> getAimerPlats() {
        return aimerPlats;
    }

    public void setAimerPlats(ArrayList<Plat> aimerPlats) {
        this.aimerPlats = aimerPlats;
    }

    public ArrayList<SHobject> getOwnSHobjects() {
        return ownSHobjects;
    }

    public void setOwnSHobjects(ArrayList<SHobject> ownSHobjects) {
        this.ownSHobjects = ownSHobjects;
    }

    public ArrayList<House> getOwnHouses() {
        return ownHouses;
    }

    public void setOwnHouses(ArrayList<House> ownHouses) {
        this.ownHouses = ownHouses;
    }

    public ArrayList<Discussion> getOwnDiscussions() {
        return ownDiscussions;
    }

    public void setOwnDiscussions(ArrayList<Discussion> ownDiscussions) {
        this.ownDiscussions = ownDiscussions;
    }
}
