package com.softserve.edu.hibernatetask.entity;

import java.math.BigDecimal;

public final class Employee {
    private Integer emplId;
    private String name;
    private BigDecimal salary;
    private String position;

    public Employee() {
    }

    public Employee(String name, BigDecimal salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

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

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
