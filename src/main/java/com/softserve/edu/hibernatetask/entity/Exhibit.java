package com.softserve.edu.hibernatetask.entity;

public final class Exhibit {
    private Integer exhibitId;
    private String name;
    private Integer hallId;
    private String date;
    private String material;
    private String author;
    private String technic;

    public Exhibit() {
    }

    public Exhibit(String name, Integer hallId, String date, String material, String author,
            String technic) {
        this.exhibitId = exhibitId;
        this.name = name;
        this.hallId = hallId;
        this.date = date;
        this.material = material;
        this.author = author;
        this.technic = technic;
    }

    public Integer getExhibitId() {
        return exhibitId;
    }

    public void setExhibitId(Integer exhibitId) {
        this.exhibitId = exhibitId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHallId(Integer hallId) {
        this.hallId = hallId;
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

    public Integer getHallId() {
        return hallId;
    }

    public String getTechnic() {
        return technic;
    }

    public void setTechnic(String technic) {
        this.technic = technic;
    }
}
