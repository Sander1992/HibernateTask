package com.softserve.edu.hibernatetask.entity;

import org.apache.commons.lang.builder.HashCodeBuilder;

import javax.persistence.*;
import java.util.Set;

@Entity
public final class Hall {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "HALL_ID")
    private Integer hallId;

    @Column (name = "HALL_NAME")
    private String name;

    @OneToMany
    @JoinColumn (name = "HALL_ID")
    private Set<Exhibit> exhibits;

    @ManyToMany (mappedBy = "halls")
    private Set<Employee> employees;

    public Hall() {
    }

    public Hall(String name) {
        this.name = name;
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

    public Set<Exhibit> getExhibits() {
        return exhibits;
    }

    public void setExhibits(Set<Exhibit> exhibits) {
        this.exhibits = exhibits;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

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
