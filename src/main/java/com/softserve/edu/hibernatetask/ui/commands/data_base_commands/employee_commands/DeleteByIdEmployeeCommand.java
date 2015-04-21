package com.softserve.edu.hibernatetask.ui.commands.data_base_commands.employee_commands;

import com.softserve.edu.hibernatetask.entity.Employee;
import com.softserve.edu.hibernatetask.service.EmployeeService;
import com.softserve.edu.hibernatetask.service.impl.MuseumEmployeeService;
import com.softserve.edu.hibernatetask.ui.command_core.Command;

import java.util.Scanner;

public class DeleteByIdEmployeeCommand implements Command{
    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee ID:");
        int employeeID = sc.nextInt();
        EmployeeService employeeService = new MuseumEmployeeService();
        Employee emp = employeeService.findById(employeeID);
        employeeService.delete(emp);

    }

    @Override
    public String getName() {
        return "Delete employee (by ID)";
    }
}
