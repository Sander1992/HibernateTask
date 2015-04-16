package com.softserve.edu.hibernatetask.entity;

import org.apache.commons.lang.builder.HashCodeBuilder;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
public final class Employee {
    private Integer emplId;
    private String name;
    private BigDecimal salary;
    private String position;
    private Set<Excursion> excursions = new HashSet<>();
    private Set<Hall> halls = new HashSet<>();

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

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    @OneToMany(mappedBy = "employee")
    public Set<Excursion> getExcursions() {
        return excursions;
    }

    public void setExcursions(Set<Excursion> excursions) {
        this.excursions = excursions;
    }

    @ManyToMany
    @JoinTable(name = "employee_hall",
            joinColumns = {@JoinColumn(name = "empl_id")},
            inverseJoinColumns = {@JoinColumn(name = "hall_id")})
    public Set<Hall> getHalls() {
        return halls;
    }

    public void setHalls(Set<Hall> halls) {
        this.halls = halls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return o.equals(emplId);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(emplId)
                .toHashCode();
    }
}
