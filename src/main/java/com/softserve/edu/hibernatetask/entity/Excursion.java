package com.softserve.edu.hibernatetask.entity;

import org.apache.commons.lang.builder.HashCodeBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public final class Excursion {
    private Integer excurId;
    private String name;
    private String schedule;
    private String duration;
    private Employee employee;

    public Excursion() {
    }

    public Excursion(String name, String schedule, String duration) {
        this.name = name;
        this.schedule = schedule;
        this.duration = duration;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

//    public Employee getEmployee() {
//        return employee;
//    }

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
        return o.equals(excurId);
    }

        @Override
        public int hashCode () {
            return new HashCodeBuilder(17, 37)
                    .append(excurId)
                    .toHashCode();
        }
    }
