package com.softserve.edu.hibernatetask;

import com.softserve.edu.hibernatetask.dao.EmployeeDAO;
import com.softserve.edu.hibernatetask.dao.HallDAO;
import com.softserve.edu.hibernatetask.dao.impl.EmployeeDataAccess;
import com.softserve.edu.hibernatetask.dao.impl.HallDataAccess;
import com.softserve.edu.hibernatetask.entity.Employee;
import com.softserve.edu.hibernatetask.entity.Hall;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
//        Hall hall = new Hall();
//        hall.setName("Second hall");
//        hall.setRespId(5);
//        HallDAO hallDAO = new HallDataAccess();
//        hallDAO.insert(hall);
//        Hall otherHall = new Hall();
//        otherHall.setName("Third hall");
//        otherHall.setRespId(3);
//        hallDAO.insert(otherHall);
//        hallDAO.findAll().forEach(e -> System.out.println(e.getName()));
    }

    private static void addEmployees() {
        EmployeeDAO empDAO = new EmployeeDataAccess();
        Employee first = new Employee();
        first.setName("Dmytro");
        first.setPosition("Chief");
        first.setSalary(BigDecimal.valueOf(100000.0));
        empDAO.insert(first);
        Employee second = new Employee();
        second.setName("Yurii");
        second.setPosition("Tech Lead");
        second.setSalary(BigDecimal.valueOf(10000.0));
        empDAO.insert(second);
        Employee third = new Employee();
        third.setName("Bohdan");
        third.setPosition("Senior Engineer");
        third.setSalary(BigDecimal.valueOf(10000.0));
        empDAO.insert(third);
    }
}
