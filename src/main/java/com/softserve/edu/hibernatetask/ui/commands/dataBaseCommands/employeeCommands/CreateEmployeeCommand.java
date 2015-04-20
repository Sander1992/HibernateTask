package com.softserve.edu.hibernatetask.ui.commands.dataBaseCommands.employeeCommands;

import com.softserve.edu.hibernatetask.entity.Employee;
import com.softserve.edu.hibernatetask.service.EmployeeService;
import com.softserve.edu.hibernatetask.service.impl.MuseumEmployeeService;
import com.softserve.edu.hibernatetask.ui.commandCore.Command;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by Sander on 20.04.2015.
 */
public class CreateEmployeeCommand implements Command{
    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee's name:");
        String name = sc.nextLine();
        System.out.println("Enter employee's position");
        String position = sc.nextLine();
        System.out.println("Enter sallary");
        BigDecimal sallary = sc.nextBigDecimal();
        Employee employee = new Employee(name, sallary, position);
        EmployeeService employeeService = new MuseumEmployeeService();
        employeeService.insert(employee);
    }

    @Override
    public String getName() {
        return "Create Employee";
    }
}
