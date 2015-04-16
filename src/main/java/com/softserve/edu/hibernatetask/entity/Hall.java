package com.softserve.edu.hibernatetask.entity;

import org.apache.commons.lang.builder.HashCodeBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.HashSet;
import java.util.Set;

@Entity
public final class Hall {
    private Integer hallId;
    private String name;
    private Set<Exhibit> exhibits = new HashSet<>();
    private Set<Employee> employees;

    public Hall() {
    }

    public Hall(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

//    public Set<Exhibit> getExhibits() {
//        return exhibits;
//    }

    public void setExhibits(Set<Exhibit> exhibits) {
        this.exhibits = exhibits;
    }

//    public Set<Employee> getEmployees() {
//        return employees;
//    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Hall hall = (Hall) o;
        return o.equals(hallId);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(hallId)
                .toHashCode();
    }
}
