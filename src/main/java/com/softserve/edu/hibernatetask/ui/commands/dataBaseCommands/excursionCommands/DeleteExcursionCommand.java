package com.softserve.edu.hibernatetask.ui.commands.dataBaseCommands.excursionCommands;

import com.softserve.edu.hibernatetask.entity.Excursion;
import com.softserve.edu.hibernatetask.service.ExcursionService;
import com.softserve.edu.hibernatetask.service.impl.MuseumExcursionService;
import com.softserve.edu.hibernatetask.ui.commandCore.Command;

import java.util.Scanner;

/**
 * Created by Sander on 20.04.2015.
 */
public class DeleteExcursionCommand implements Command{

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter excursion ID:");
        int excursionID = sc.nextInt();
        ExcursionService excursionService = new MuseumExcursionService();
        Excursion excur = excursionService.findById(excursionID);
        excursionService.delete(excur);

    }

    @Override
    public String getName() {
        return "Delete excursion (by ID)";
    }


}
