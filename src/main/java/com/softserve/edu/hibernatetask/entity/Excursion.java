package com.softserve.edu.hibernatetask.entity;

/**
 * Created by Sander on 11.04.2015.
 */
public class Excursion {
    private Integer excur_id;
    private String name;
    private String schedule;
    private String duration;
    private Integer resp_id;

    public Excursion() {}

    public Integer getExcur_id() {
        return excur_id;
    }

    public void setExcur_id(Integer excur_id) {
        this.excur_id = excur_id;
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

    public Integer getResp_id() {
        return resp_id;
    }

    public void setResp_id(Integer resp_id) {
        this.resp_id = resp_id;
    }
}
