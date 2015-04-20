package com.softserve.edu.hibernatetask.ui.commands.dataBaseCommands.excursionCommands;

import com.softserve.edu.hibernatetask.service.impl.MuseumExcursionService;
import com.softserve.edu.hibernatetask.ui.commandCore.Command;

/**
 * Created by Sander on 20.04.2015.
 */
public class GetAllExcursionsCommand implements Command{
    @Override
    public void execute() {
        new MuseumExcursionService().showAll();
    }

    @Override
    public String getName() {
        return "Get all excursions";
    }
}


