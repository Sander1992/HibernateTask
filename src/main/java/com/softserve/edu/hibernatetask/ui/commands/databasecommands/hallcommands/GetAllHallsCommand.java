package com.softserve.edu.hibernatetask.ui.commands.databasecommands.hallcommands;

import com.softserve.edu.hibernatetask.service.impl.MuseumHallService;
import com.softserve.edu.hibernatetask.ui.commandcore.Command;


public class GetAllHallsCommand implements Command {

    @Override
    public void execute() {
        new MuseumHallService().showAll();
    }

    @Override
    public String getName() {
        return "Get all halls";
    }
}
