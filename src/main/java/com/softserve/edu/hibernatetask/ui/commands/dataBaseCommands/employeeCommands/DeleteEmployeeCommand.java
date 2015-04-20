package com.softserve.edu.hibernatetask.ui.commands.dataBaseCommands.employeeCommands;

import com.softserve.edu.hibernatetask.entity.Employee;
import com.softserve.edu.hibernatetask.service.EmployeeService;
import com.softserve.edu.hibernatetask.service.impl.MuseumEmployeeService;
import com.softserve.edu.hibernatetask.ui.commandCore.Command;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Sander on 20.04.2015.
 */
public class DeleteEmployeeCommand  implements Command {
    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Empl name:");
        String str = sc.nextLine();
        EmployeeService employeeService = new MuseumEmployeeService();
        List<Employee> emp = employeeService.findByName(str);
        System.out.println(emp);
        for(Employee e: emp){
            employeeService.delete(e);
        }
    }

    @Override
    public String getName() {
        return "Delete Employee";
    }
}
