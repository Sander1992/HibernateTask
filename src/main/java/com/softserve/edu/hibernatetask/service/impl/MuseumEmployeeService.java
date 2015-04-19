package com.softserve.edu.hibernatetask.service.impl;

import com.softserve.edu.hibernatetask.entity.Employee;
import com.softserve.edu.hibernatetask.service.EmployeeService;

public final class MuseumEmployeeService extends MuseumBaseService<Employee> implements EmployeeService{

    public MuseumEmployeeService() {
        super(Employee.class);
    }

    @Override
    public void showInfo() {

    }
}
