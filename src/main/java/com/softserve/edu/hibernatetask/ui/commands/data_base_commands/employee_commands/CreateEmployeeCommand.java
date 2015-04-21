package com.softserve.edu.hibernatetask.ui.commands.data_base_commands.employee_commands;

import com.softserve.edu.hibernatetask.entity.Employee;
import com.softserve.edu.hibernatetask.service.EmployeeService;
import com.softserve.edu.hibernatetask.service.impl.MuseumEmployeeService;
import com.softserve.edu.hibernatetask.ui.command_core.Command;

import java.math.BigDecimal;
import java.util.Scanner;


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
