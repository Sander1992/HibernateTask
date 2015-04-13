package com.softserve.edu.hibernatetask.entity;

public final class Hall {
    private Integer hallId;
    private String name;
    private Integer respId;

    public Hall() {
    }

    public Hall(String name, Integer respId) {
        this.name = name;
        this.respId = respId;
    }

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

    public Integer getRespId() {
        return respId;
    }

    public void setRespId(Integer respId) {
        this.respId = respId;
    }
}
