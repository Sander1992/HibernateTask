package com.softserve.edu.hibernatetask.ui.commands.dataBaseCommands.hallCommands;

import com.softserve.edu.hibernatetask.entity.Hall;
import com.softserve.edu.hibernatetask.service.HallService;
import com.softserve.edu.hibernatetask.service.impl.MuseumHallService;
import com.softserve.edu.hibernatetask.ui.commandCore.Command;
import com.softserve.edu.hibernatetask.utils.PrettyOutput;

import java.util.Scanner;

/**
 * Created by Sander on 21.04.2015.
 */
public class FindByIDHallCommand  implements Command {
    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hall ID:");
        int hallID = sc.nextInt();
        HallService hallService = new MuseumHallService();
        Hall hall = hallService.findById(hallID);
        PrettyOutput.displayInfo("All halls with id " + hallID);

        PrettyOutput.displayColumns("Id", "Responsible staff");
        PrettyOutput.displayDelimiter();
        PrettyOutput.displayColumns(hall.getName(), hall.getEmployees());
        PrettyOutput.displayDelimiter();
    }

    @Override
    public String getName() {
        return "Find hall (by ID)";
    }
}
