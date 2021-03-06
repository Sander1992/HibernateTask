package com.softserve.edu.hibernatetask.ui.commands.databasecommands.employeecommands;

import com.softserve.edu.hibernatetask.entity.Employee;
import com.softserve.edu.hibernatetask.service.EmployeeService;
import com.softserve.edu.hibernatetask.service.impl.MuseumEmployeeService;
import com.softserve.edu.hibernatetask.ui.commandcore.Command;
import com.softserve.edu.hibernatetask.utils.PrettyOutput;

import java.util.Scanner;


public class FindByIDEmployeeCommand implements Command{
    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee ID:");
        int employeeID = sc.nextInt();
        EmployeeService employeeService = new MuseumEmployeeService();
        Employee emp = employeeService.findById(employeeID);
        PrettyOutput.displayInfo("An employee with id " + employeeID);
        PrettyOutput.displayColumns("Name", "Position", "Salary");
        PrettyOutput.displayColumns(emp.getName(), emp.getPosition(), emp.getSalary());
        PrettyOutput.displayDelimiter();
    }

    @Override
    public String getName() {
        return "Find employee (by ID)";
    }
}


