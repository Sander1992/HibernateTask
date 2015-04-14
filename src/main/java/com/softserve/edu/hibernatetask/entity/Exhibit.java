package com.softserve.edu.hibernatetask.entity;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public final class Exhibit {
    private Integer exhibitId;
    private String name;
    private Hall hall;
    private String date;
    private String material;
    private String author;
    private String technic;

    public Exhibit() {
    }

    public Exhibit(String name, String date, String material, String author, String technic) {
        this.name = name;
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

    public void setHall(Hall hallId) {
        this.hall = hallId;
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

    public Hall getHall() {
        return hall;
    }

    public String getTechnic() {
        return technic;
    }

    public void setTechnic(String technic) {
        this.technic = technic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Exhibit exhibit = (Exhibit) o;
        return o.equals(exhibitId);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(exhibitId)
                .toHashCode();
    }
}
