package com.softserve.edu.hibernatetask.entity;

public class Hall {
    private Integer hallId;
    private String name;
    private String respId;

    public Hall(){}

    public Integer getHallId() {
        return hallId;
    }

    public void setHallId(Integer hallId) {
        this.hallId = hallId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRespId() {
        return respId;
    }

    public void setRespId(String respId) {
        this.respId = respId;
    }
}
