package com.softserve.edu.hibernatetask.entity;

public class Excursion {
    private Integer excurId;
    private String name;
    private String schedule;
    private String duration;
    private Integer respId;

    public Excursion() {}

    public Integer getExcurId() {
        return excurId;
    }

    public void setExcurId(Integer excurId) {
        this.excurId = excurId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Integer getRespId() {
        return respId;
    }

    public void setRespId(Integer respId) {
        this.respId = respId;
    }
}