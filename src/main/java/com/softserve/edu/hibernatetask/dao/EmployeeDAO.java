package com.softserve.edu.hibernatetask.dao;

import com.softserve.edu.hibernatetask.entity.Employee;

import java.util.List;

public interface EmployeeDAO extends BaseDAO<Employee> {
    List<Employee> findByPosition(String position);
}
