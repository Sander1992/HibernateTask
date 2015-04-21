package com.softserve.edu.hibernatetask.ui.commands.databasecommands.excursioncommands;

import com.softserve.edu.hibernatetask.entity.Excursion;
import com.softserve.edu.hibernatetask.service.ExcursionService;
import com.softserve.edu.hibernatetask.service.impl.MuseumExcursionService;
import com.softserve.edu.hibernatetask.ui.commandcore.Command;

import java.util.Scanner;


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
