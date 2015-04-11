package com.softserve.edu.hibernate_task.entity;

/**
 * Created by Sander on 12.04.2015.
 */
public class Hall {
    private Integer hall_id;
    private String name;
    private String resp_id;

    public Hall(){}

    public Integer getHall_id() {
        return hall_id;
    }

    public void setHall_id(Integer hall_id) {
        this.hall_id = hall_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResp_id() {
        return resp_id;
    }

    public void setResp_id(String resp_id) {
        this.resp_id = resp_id;
    }
}
