package com.softserve.edu.hibernatetask.ui.commands.data_base_commands.hall_commands;

import com.softserve.edu.hibernatetask.entity.Employee;
import com.softserve.edu.hibernatetask.entity.Hall;
import com.softserve.edu.hibernatetask.service.EmployeeService;
import com.softserve.edu.hibernatetask.service.HallService;
import com.softserve.edu.hibernatetask.service.impl.MuseumEmployeeService;
import com.softserve.edu.hibernatetask.service.impl.MuseumHallService;
import com.softserve.edu.hibernatetask.ui.command_core.Command;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

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
