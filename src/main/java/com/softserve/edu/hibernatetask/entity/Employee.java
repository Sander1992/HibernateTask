package com.softserve.edu.hibernatetask.entity;

import org.apache.commons.lang.builder.HashCodeBuilder;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
public final class Employee {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "EMPL_ID")
    private Integer emplId;

    @Column(name = "EMPL_NAME")
    private String name;

    @Column (name = "EMPL_SALARY")
    private BigDecimal salary;

    @Column (name = "EMPL_POSITION")
    private String position;

    @OneToMany
    @JoinColumn (name = "EMPL_ID")
    private Set<Excursion> excursions;

    @ManyToMany
    @JoinTable(
            name = "EMPLOYEE_HALL",
            joinColumns = {@JoinColumn(name="EMPL_ID")},
            inverseJoinColumns = {@JoinColumn(name = "HALL_ID")}
    )
    private Set<Hall> halls;

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

    public Set<Excursion> getExcursions() {
        return excursions;
    }

    public void setExcursions(Set<Excursion> excursions) {
        this.excursions = excursions;
    }

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
