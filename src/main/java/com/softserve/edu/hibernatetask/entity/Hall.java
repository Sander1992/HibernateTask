package com.softserve.edu.hibernatetask.entity;

import org.apache.commons.lang.builder.HashCodeBuilder;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(uniqueConstraints = {
})
public final class Hall {
    private Integer id;
    private String name;
    private Set<Exhibit> exhibits;
    private Set<Employee> employees;

    public Hall() {
    }

    public Hall(String name, Set<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(cascade = {CascadeType.MERGE}, orphanRemoval = true,
            mappedBy = "hall")
    public Set<Exhibit> getExhibits() {
        return exhibits;
    }

    public void setExhibits(Set<Exhibit> exhibits) {
        this.exhibits = exhibits;
    }

    @ManyToMany(cascade = {CascadeType.MERGE})
    @JoinTable(name = "employee_hall",
            joinColumns = {@JoinColumn(name = "hall_id")},
            inverseJoinColumns = {@JoinColumn(nullable = false, name = "empl_id")})
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
