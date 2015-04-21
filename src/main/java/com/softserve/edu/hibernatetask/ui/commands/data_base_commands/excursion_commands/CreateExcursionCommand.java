package com.softserve.edu.hibernatetask.ui.commands.data_base_commands.excursion_commands;

import com.softserve.edu.hibernatetask.entity.Employee;
import com.softserve.edu.hibernatetask.entity.Excursion;
import com.softserve.edu.hibernatetask.service.EmployeeService;
import com.softserve.edu.hibernatetask.service.ExcursionService;
import com.softserve.edu.hibernatetask.service.impl.MuseumEmployeeService;
import com.softserve.edu.hibernatetask.service.impl.MuseumExcursionService;
import com.softserve.edu.hibernatetask.ui.commandcore.Command;

import java.util.Scanner;


public class CreateExcursionCommand implements Command {

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter excursion's name:");
        String name = sc.nextLine();
        System.out.println("Enter excursion's schedule");
        String schedule = sc.nextLine();
        System.out.println("Enter duration");
        String duration = sc.nextLine();
        System.out.println("Enter Responsible ID");
        int respID = sc.nextInt();
        EmployeeService employeeService = new MuseumEmployeeService();
        Employee employee = employeeService.findById(respID);
        Excursion excursion = new Excursion(name, schedule, duration, employee);
        ExcursionService excursionService = new MuseumExcursionService();
        excursionService.insert(excursion);
    }

    @Override
    public String getName() {
        return "Create excursion";
    }
}
