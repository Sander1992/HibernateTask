package com.softserve.edu.hibernatetask;

import com.softserve.edu.hibernatetask.entity.Employee;
import com.softserve.edu.hibernatetask.service.BaseService;
import com.softserve.edu.hibernatetask.service.impl.MuseumBaseService;
import com.softserve.edu.hibernatetask.utils.Configurator;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        Employee first = new Employee("Dmytro", BigDecimal.valueOf(1000000.0), "Chief");
        Employee second = new Employee("Yurii", BigDecimal.valueOf(100000.0), "Tech Lead");
        Employee third = new Employee("Bohdan", BigDecimal.valueOf(10000.0), "Senior Engineer");
    }
}
