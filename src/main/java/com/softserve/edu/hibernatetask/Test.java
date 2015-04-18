package com.softserve.edu.hibernatetask;

import com.softserve.edu.hibernatetask.dao.EmployeeDAO;
import com.softserve.edu.hibernatetask.dao.ExcursionDAO;
import com.softserve.edu.hibernatetask.dao.HallDAO;
import com.softserve.edu.hibernatetask.dao.impl.EmployeeDataAccess;
import com.softserve.edu.hibernatetask.dao.impl.ExcursionDataAccess;
import com.softserve.edu.hibernatetask.dao.impl.HallDataAccess;
import com.softserve.edu.hibernatetask.entity.Employee;
import com.softserve.edu.hibernatetask.entity.Excursion;
import com.softserve.edu.hibernatetask.entity.Hall;
import com.softserve.edu.hibernatetask.service.BaseService;
import com.softserve.edu.hibernatetask.service.impl.BaseMuseumService;
import com.softserve.edu.hibernatetask.utils.Configurator;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        addEmployees();
        BaseService<Employee> empService = new BaseMuseumService<>(Employee.class);
        empService.findAll().forEach(e-> System.out.println(e.getName()));
        Configurator.closeSession();
    }


    private static void addEmployees() {
        Employee first = new Employee("Dmytro", BigDecimal.valueOf(1000000.0), "Chief");
        Employee second = new Employee("Yurii", BigDecimal.valueOf(100000.0), "Tech Lead");
        Employee third = new Employee("Bohdan", BigDecimal.valueOf(10000.0), "Senior Engineer");
        BaseService<Employee> empDAO = new BaseMuseumService<>(Employee.class);
        empDAO.insert(first);
        empDAO.insert(second);
        empDAO.insert(third);
    }
}
