package com.softserve.edu.hibernate_task.entity;

/**
 * Created by Sander on 12.04.2015.
 */
public class Exhibit {
    private Integer exhib_id;
    private String name;
    private Integer hall_id;
    private String date;
    private String material;
    private String author;

    public Exhibit(){}

    public Integer getExhib_id() {
        return exhib_id;
    }

    public void setExhib_id(Integer exhib_id) {
        this.exhib_id = exhib_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHall_id() {
        return hall_id;
    }

    public void setHall_id(Integer hall_id) {
        this.hall_id = hall_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
