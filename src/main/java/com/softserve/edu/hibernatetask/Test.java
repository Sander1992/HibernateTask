package com.softserve.edu.hibernatetask;

import com.softserve.edu.hibernatetask.entity.Employee;
import com.softserve.edu.hibernatetask.service.EmployeeService;
import com.softserve.edu.hibernatetask.service.impl.MuseumEmployeeService;
import com.softserve.edu.hibernatetask.utils.Configurator;
import com.softserve.edu.hibernatetask.utils.PrettyOutput;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) {
        PrettyOutput.disableLogger();
        Employee first = new Employee("Dmytro", BigDecimal.valueOf(1000000.0), "Chief");
        Employee second = new Employee("Yurii", BigDecimal.valueOf(100000.0), "Tech Lead");
        Employee third = new Employee("Bohdan", BigDecimal.valueOf(10000.0), "Senior Engineer");
        EmployeeService employeeService = new MuseumEmployeeService();
        employeeService.insert(first);
        employeeService.insert(second);
        employeeService.insert(third);
        employeeService.showInfo();
        Configurator.closeSession();
    }
}
