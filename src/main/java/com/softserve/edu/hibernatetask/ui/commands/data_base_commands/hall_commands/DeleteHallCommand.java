package com.softserve.edu.hibernatetask.ui.commands.data_base_commands.hall_commands;

import com.softserve.edu.hibernatetask.entity.Hall;
import com.softserve.edu.hibernatetask.service.HallService;
import com.softserve.edu.hibernatetask.service.impl.MuseumHallService;
import com.softserve.edu.hibernatetask.ui.command_core.Command;

import java.util.Scanner;


public class DeleteHallCommand  implements Command{

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hall ID:");
        int hallID = sc.nextInt();
        HallService hallService = new MuseumHallService();
        Hall hall = hallService.findById(hallID);
        hallService.delete(hall);

    }

    @Override
    public String getName() {
        return "Delete hall (by ID)";
    }


}