package com.example.tiki_app.model;

import java.io.Serializable;

public class Giay implements Serializable {
    private String name;
    private int img;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public Giay(String name, int img) {
        this.name = name;
        this.img = img;
    }

    @Override
    public String toString() {
        return "Giay{" +
                "name='" + name + '\'' +
                ", img=" + img +
                '}';
    }
}
