package com.softserve.edu.hibernate_task.entity;

/**
 * Created by Sander on 11.04.2015.
 */
public class Employee {
    private Integer empl_id;
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

    public Integer getEmpl_id() {
        return empl_id;
    }

    public void setEmpl_id(Integer id) {
        this.empl_id = id;
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
