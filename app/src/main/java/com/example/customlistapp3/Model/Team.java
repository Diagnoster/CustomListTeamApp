package com.example.customlistapp3.Model;

import java.util.List;

public class Team {

    private int img;
    private String name;
    private List<String> titles;

    public Team() {

    }

    public Team(int img, String name, List<String> titles) {
        this.img = img;
        this.name = name;
        this.titles = titles;

    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String GetName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTitles() {
        return titles;
    }

    public void setTitles(List<String> titles) {
        this.titles = titles;
    }

}
