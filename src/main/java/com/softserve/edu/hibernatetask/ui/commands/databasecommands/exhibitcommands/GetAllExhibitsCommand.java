package com.softserve.edu.hibernatetask.ui.commands.databasecommands.exhibitcommands;

import com.softserve.edu.hibernatetask.service.impl.MuseumExhibitService;
import com.softserve.edu.hibernatetask.ui.commandcore.Command;


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


