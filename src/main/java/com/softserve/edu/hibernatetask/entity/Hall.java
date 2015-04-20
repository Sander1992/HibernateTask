package com.softserve.edu.hibernatetask.entity;

import org.apache.commons.lang.builder.HashCodeBuilder;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Hall implements MuseumEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @OneToMany(cascade = {CascadeType.ALL}, orphanRemoval = true,
            mappedBy = "hall")
    private Set<Exhibit> exhibits = new HashSet<>();
    ;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "employee_hall",
            joinColumns = {@JoinColumn(nullable = false, name = "hall_id")},
            inverseJoinColumns = {@JoinColumn(nullable = false, name = "empl_id")})
    private Set<Employee> employees = new HashSet<>();

    public Hall() {
    }

    public Hall(String name, Set<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

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
