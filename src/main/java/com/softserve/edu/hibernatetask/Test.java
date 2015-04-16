package com.softserve.edu.hibernatetask;

import com.softserve.edu.hibernatetask.dao.EmployeeDAO;
import com.softserve.edu.hibernatetask.dao.HallDAO;
import com.softserve.edu.hibernatetask.dao.impl.EmployeeDataAccess;
import com.softserve.edu.hibernatetask.dao.impl.HallDataAccess;
import com.softserve.edu.hibernatetask.entity.Employee;
import com.softserve.edu.hibernatetask.entity.Hall;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        addEmployeeAndHalls();
        EmployeeDAO empDAO = new EmployeeDataAccess();
        Employee emp = empDAO.findByName("Yurii").get(0);
        HallDAO hallDAO = new HallDataAccess();
        Hall hall = hallDAO.findByName("Main hall").get(0);
        emp.setHalls(new HashSet<>(Arrays.asList(hall)));
        empDAO.update(emp);
    }

    private static void addEmployeeAndHalls() {
        HallDAO hallDAO = new HallDataAccess();
        Hall fist = new Hall("Main hall");
        hallDAO.insert(fist);
        /*Hall second = new Hall("Second hall");
        hallDAO.insert(second);
        HallDAO hallDAO = new HallDataAccess();
        Hall first = hallDAO.findByName("Main hall").get(0);
        Hall second = hallDAO.findByName("Second hall").get(0);
        */
        Employee emp = new Employee("Yurii", BigDecimal.valueOf(100000.0), "Tech Lead");
//        emp.setHalls(new HashSet<>(Arrays.asList(first, second)));
        EmployeeDAO employeeDAO = new EmployeeDataAccess();
        employeeDAO.insert(emp);
    }

    private static void addEmployees() {
        Employee first = new Employee("Dmytro", BigDecimal.valueOf(1000000.0), "Chief");
        Employee second = new Employee("Yurii", BigDecimal.valueOf(100000.0), "Tech Lead");
        Employee third = new Employee("Bohdan", BigDecimal.valueOf(10000.0), "Senior Engineer");
        EmployeeDAO empDAO = new EmployeeDataAccess();
        empDAO.insert(first);
        empDAO.insert(second);
        empDAO.insert(third);
    }

    private static void showEmployees() {
        EmployeeDAO empDAO = new EmployeeDataAccess();
        empDAO.findAll().forEach(e -> System.out.println(e.getName()));
    }

    private static void addHalls() {
        Hall mainHall = new Hall("Main Hall");
        Hall dinoHall = new Hall("Dino Hall");
        HallDAO hallDAO = new HallDataAccess();
        hallDAO.insert(mainHall);
        hallDAO.insert(dinoHall);
    }

    private static void showHalls() {
        HallDAO hallDAO = new HallDataAccess();
        hallDAO.findAll().forEach(e -> System.out.println(e.getName()));
    }
}
