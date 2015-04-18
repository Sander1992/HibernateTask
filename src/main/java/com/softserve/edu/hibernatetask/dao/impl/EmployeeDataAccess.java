package com.softserve.edu.hibernatetask.dao.impl;

import com.softserve.edu.hibernatetask.dao.EmployeeDAO;
import com.softserve.edu.hibernatetask.entity.Employee;
import com.softserve.edu.hibernatetask.utils.RecordFinder;

import javax.persistence.EntityManager;
import java.util.List;

public final class EmployeeDataAccess extends BaseDataAccess<Employee> implements EmployeeDAO {
    public EmployeeDataAccess(EntityManager entityManager) {
        super(Employee.class, entityManager);
    }

    @Override
    public List<Employee> findByPosition(String position) {
        return RecordFinder.find(Employee.class, "position", position);
    }
}
