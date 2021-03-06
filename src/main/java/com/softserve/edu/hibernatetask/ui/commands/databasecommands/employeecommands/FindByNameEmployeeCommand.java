package com.softserve.edu.hibernatetask.ui.commands.databasecommands.employeecommands;

import com.softserve.edu.hibernatetask.entity.Employee;
import com.softserve.edu.hibernatetask.service.EmployeeService;
import com.softserve.edu.hibernatetask.service.impl.MuseumEmployeeService;
import com.softserve.edu.hibernatetask.ui.commandcore.Command;
import com.softserve.edu.hibernatetask.utils.PrettyOutput;

import java.util.List;
import java.util.Scanner;

import static com.softserve.edu.hibernatetask.utils.PrettyOutput.displayColumns;


public class FindByNameEmployeeCommand implements Command{
    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Empl name:");
        String str = sc.nextLine();
        EmployeeService employeeService = new MuseumEmployeeService();
        List<Employee> emp = employeeService.findByName(str);
        PrettyOutput.displayInfo("All employees with name " + str);
        PrettyOutput.displayColumns("Name", "Position", "Salary");
        emp.forEach(e -> displayColumns(e.getName(), e.getPosition(), e.getSalary()));
        PrettyOutput.displayDelimiter();
    }

    @Override
    public String getName() {
        return "Find employee (by name)";
    }
}
