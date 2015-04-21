package com.softserve.edu.hibernatetask.ui.commands.dataBaseCommands.exhibitCommands;

import com.softserve.edu.hibernatetask.entity.Exhibit;
import com.softserve.edu.hibernatetask.entity.Hall;
import com.softserve.edu.hibernatetask.service.ExhibitService;
import com.softserve.edu.hibernatetask.service.HallService;
import com.softserve.edu.hibernatetask.service.impl.MuseumExhibitService;
import com.softserve.edu.hibernatetask.service.impl.MuseumHallService;
import com.softserve.edu.hibernatetask.ui.commandCore.Command;
import com.softserve.edu.hibernatetask.utils.DateHandler;

import java.util.Date;
import java.util.Scanner;

/**
 * Created by Sander on 21.04.2015.
 */
public class CreateExhibitCommand implements Command{
    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter exhibit's name:");
        String name = sc.nextLine();
        System.out.println("Enter incoming date");
        Date date = DateHandler.parseDate(sc.nextLine());
        System.out.println("Enter  exhibit's material");
        String matrial = sc.nextLine();
        System.out.println("Enter exhibit's author");
        String author = sc.nextLine();
        System.out.println("Enter exhibit's technic");
        String technic = sc.nextLine();
        System.out.println("Enter hall ID");
        int hallID = sc.nextInt();
        HallService hallService = new MuseumHallService();
        Hall hall = hallService.findById(hallID);
        Exhibit exhibit = new Exhibit(name, date, matrial, author, technic, hall);
        ExhibitService exhibitService = new MuseumExhibitService();
        exhibitService.insert(exhibit);
    }

    @Override
    public String getName() {
        return "Create exhibit";
    }

}
