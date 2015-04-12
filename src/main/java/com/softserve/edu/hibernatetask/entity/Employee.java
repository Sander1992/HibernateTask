package com.softserve.edu.hibernatetask.entity;

public class Employee {
    private Integer emplId;
    private String name;
    private Integer salary;
    private String position;

    public Employee(){}

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getEmplId() {
        return emplId;
    }

    public void setEmplId(Integer id) {
        this.emplId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }



}
