package com.softserve.edu.hibernatetask.ui.commands.databasecommands.excursioncommands;

import com.softserve.edu.hibernatetask.service.impl.MuseumExcursionService;
import com.softserve.edu.hibernatetask.ui.commandcore.Command;


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


