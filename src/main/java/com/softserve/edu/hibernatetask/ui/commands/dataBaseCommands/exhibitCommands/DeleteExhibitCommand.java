package com.softserve.edu.hibernatetask.ui.commands.dataBaseCommands.exhibitCommands;

import com.softserve.edu.hibernatetask.entity.Exhibit;
import com.softserve.edu.hibernatetask.service.ExhibitService;
import com.softserve.edu.hibernatetask.service.impl.MuseumExhibitService;
import com.softserve.edu.hibernatetask.ui.commandCore.Command;

import java.util.Scanner;

/**
 * Created by Sander on 21.04.2015.
 */
public class DeleteExhibitCommand implements Command{

    @Override
        public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter exhibit ID:");
        int exhibitID = sc.nextInt();
        ExhibitService exhibitService = new MuseumExhibitService();
        Exhibit exhibit = exhibitService.findById(exhibitID);
        exhibitService.delete(exhibit);

    }

    @Override
    public String getName() {
        return "Delete exhibit (by ID)";
    }


}

