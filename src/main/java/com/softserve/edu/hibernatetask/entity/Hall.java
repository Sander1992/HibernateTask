package com.softserve.edu.hibernatetask.entity;

import java.util.HashSet;
import java.util.Set;

public final class Hall {
    private Integer hallId;
    private String name;
    private Integer fk_empl_id;
    private Set<Exhibit> exhibits = new HashSet<>();
    private Employee employee;


    public Hall() {
    }

    public Hall(String name, Integer respId) {
        this.name = name;
        this.fk_empl_id = respId;
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

    public Integer getFk_empl_id() {
        return fk_empl_id;
    }

    public void setFk_empl_id(Integer respId) {
        this.fk_empl_id = respId;
    }

    public Set<Exhibit> getExhibits() {
        return exhibits;
    }

    public void setExhibits(Set<Exhibit> exhibits) {
        this.exhibits = exhibits;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
