package com.softserve.edu.hibernatetask.entity;

import org.apache.commons.lang.builder.HashCodeBuilder;

import javax.persistence.*;
import java.util.Date;

@Entity
public final class Excursion {
    private Integer id;
    private String name;
    private Date schedule;
    private String duration;
    private Employee employee;

    public Excursion() {
    }

    public Excursion(String name, Date schedule, String duration, Employee employee) {
        this.name = name;
        this.schedule = schedule;
        this.duration = duration;
        this.employee = employee;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer excurId) {
        this.id = excurId;
    }

    @Column(nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getSchedule() {
        return schedule;
    }

    public void setSchedule(Date schedule) {
        this.schedule = schedule;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @ManyToOne
    @JoinColumn(nullable = false, name = "empl_id")
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee respId) {
        this.employee = respId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Excursion excursion = (Excursion) o;
        return o.equals(id);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .toHashCode();
    }

    @Override
    public String toString() {
        return name;
    }
}
