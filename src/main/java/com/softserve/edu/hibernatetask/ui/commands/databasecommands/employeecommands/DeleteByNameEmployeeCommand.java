package com.softserve.edu.hibernatetask.ui.commands.databasecommands.employeecommands;

import com.softserve.edu.hibernatetask.entity.Employee;
import com.softserve.edu.hibernatetask.service.EmployeeService;
import com.softserve.edu.hibernatetask.service.impl.MuseumEmployeeService;
import com.softserve.edu.hibernatetask.ui.commandcore.Command;

import java.util.List;
import java.util.Scanner;

public class DeleteByNameEmployeeCommand implements Command {
    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Empl name:");
        String str = sc.nextLine();
        EmployeeService employeeService = new MuseumEmployeeService();
        List<Employee> emp = employeeService.findByName(str);
        for (Employee e : emp) {
            employeeService.delete(e);
        }
    }

    @Override
    public String getName() {
        return "Delete employee (by name)";
    }
}
