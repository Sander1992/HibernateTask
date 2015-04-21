package com.softserve.edu.hibernatetask.ui.commands.dataBaseCommands.hallCommands;

import com.softserve.edu.hibernatetask.entity.Employee;
import com.softserve.edu.hibernatetask.entity.Hall;
import com.softserve.edu.hibernatetask.service.EmployeeService;
import com.softserve.edu.hibernatetask.service.HallService;
import com.softserve.edu.hibernatetask.service.impl.MuseumEmployeeService;
import com.softserve.edu.hibernatetask.service.impl.MuseumHallService;
import com.softserve.edu.hibernatetask.ui.commandCore.Command;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Sander on 21.04.2015.
 */
public class CreateHallCommand  implements Command {
    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hall's name:");
        String name = sc.nextLine();

        System.out.println("Enter employee ID");
        int emplID = sc.nextInt();
        EmployeeService employeeService = new MuseumEmployeeService();
        Employee employee = employeeService.findById(emplID);
        Hall hall = new Hall (name, new HashSet<>(Arrays.asList(employee)));
        HallService hallService = new MuseumHallService();
        hallService.insert(hall);
    }

    @Override
    public String getName() {
        return "Create hall";
    }

}
