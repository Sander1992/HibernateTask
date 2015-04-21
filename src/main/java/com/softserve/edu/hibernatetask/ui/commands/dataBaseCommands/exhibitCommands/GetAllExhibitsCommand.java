package com.softserve.edu.hibernatetask.ui.commands.dataBaseCommands.exhibitCommands;

import com.softserve.edu.hibernatetask.service.impl.MuseumExhibitService;
import com.softserve.edu.hibernatetask.ui.commandCore.Command;

/**
 * Created by Sander on 21.04.2015.
 */
public class GetAllExhibitsCommand implements Command{

    @Override
    public void execute() {
        new MuseumExhibitService().showAll();
    }

    @Override
    public String getName() {
        return "Get all exhibits";
    }
}


