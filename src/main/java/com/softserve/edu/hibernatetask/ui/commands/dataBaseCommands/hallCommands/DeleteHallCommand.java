package com.softserve.edu.hibernatetask.ui.commands.dataBaseCommands.hallCommands;

import com.softserve.edu.hibernatetask.entity.Hall;
import com.softserve.edu.hibernatetask.service.HallService;
import com.softserve.edu.hibernatetask.service.impl.MuseumHallService;
import com.softserve.edu.hibernatetask.ui.commandCore.Command;

import java.util.Scanner;

/**
 * Created by Sander on 21.04.2015.
 */
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