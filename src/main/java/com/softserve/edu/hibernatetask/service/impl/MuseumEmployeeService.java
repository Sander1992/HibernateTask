package com.softserve.edu.hibernatetask.service.impl;

import com.softserve.edu.hibernatetask.entity.Employee;
import com.softserve.edu.hibernatetask.service.EmployeeService;

import java.util.List;

import static com.softserve.edu.hibernatetask.utils.PrettyOutput.*;

public final class MuseumEmployeeService extends MuseumBaseService<Employee> implements EmployeeService {

    public MuseumEmployeeService() {
        super(Employee.class);
    }

    @Override
    public void showInfo() {
        List<Employee> employees = findAll();
        displayInfo("Our staff");
        displayColumns("Name", "Position");
        displayDelimiter();
        employees.forEach(e -> displayColumns(e.getName(), e.getPosition()));
        displayDelimiter();
    }
}
