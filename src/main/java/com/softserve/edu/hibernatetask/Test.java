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
import com.softserve.edu.hibernatetask.utils.SessionConfigurator;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        addEmployeeAndHalls();

        System.exit(0);
    }

    private static void addEmployeeAndHalls() {
        Hall main = new Hall("Main hall");
        Hall secondHall = new Hall("Second hall");
        Employee first = new Employee("Dmytro", BigDecimal.valueOf(1000000.0), "Chief");
        Employee second = new Employee("Yurii", BigDecimal.valueOf(100000.0), "Tech Lead");
        HallDAO hallDAO = new HallDataAccess();
        main.setId(hallDAO.insert(main));
        second.setId(hallDAO.insert(secondHall));
        first.setHalls(new HashSet<>(Arrays.asList(main, secondHall)));
        second.setHalls(new HashSet<>(Arrays.asList(main, secondHall)));
        EmployeeDAO employeeDAO = new EmployeeDataAccess();
        employeeDAO.insert(first);
        employeeDAO.insert(second);
        //--------------------------------------
//        EmployeeDAO employeeDAO = new EmployeeDataAccess();
//        first.setId(employeeDAO.insert(first));
//        second.setId(employeeDAO.insert(second));
//        main.setEmployees(new HashSet<>(Arrays.asList(first, second)));
//        secondHall.setEmployees(new HashSet<>(Arrays.asList(first, second)));
//        HallDAO hallDAO = new HallDataAccess();
//        hallDAO.insert(main);
//        hallDAO.insert(secondHall);
    }

    private static void updateHall() {
        HallDAO hallDAO = new HallDataAccess();
        Hall hall = hallDAO.findByName("Main hall").get(0);
        hall.setName("Supermain hall");
        hallDAO.update(hall);
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

    private static void addHalls() {
        Hall mainHall = new Hall("Main Hall");
        Hall dinoHall = new Hall("Dino Hall");
        HallDAO hallDAO = new HallDataAccess();
        hallDAO.insert(mainHall);
        hallDAO.insert(dinoHall);
    }

    private static void showEmployees() {
        EmployeeDAO empDAO = new EmployeeDataAccess();
        empDAO.findAll().forEach(e -> System.out.println(e.getName()));
    }

    private static void showHalls() {
        HallDAO hallDAO = new HallDataAccess();
        hallDAO.findAll().forEach(e -> System.out.println(e.getName()));
    }

    private static void addExcAndEmp() {
        Excursion first = new Excursion("Lviv", "22/01/2015", "1 week");
        Excursion second = new Excursion("Kyiv", "22/02/2015", "1 week");
        ExcursionDAO excursionDAO = new ExcursionDataAccess();
        first.setId(excursionDAO.insert(first));
        second.setId(excursionDAO.insert(second));
        Employee emp = new Employee("Dmytro", BigDecimal.valueOf(1000000.0), "Chief");
        emp.setExcursions(new HashSet<>(Arrays.asList(first, second)));
        emp.getExcursions().forEach(e -> System.out.println(e.getName()));
        EmployeeDAO employeeDAO = new EmployeeDataAccess();
        employeeDAO.insert(emp);
//        first.setEmployee(emp);
//        second.setEmployee(emp);
//        excursionDAO.update(first);
//        excursionDAO.update(second);
    }
}
