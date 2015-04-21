package com.softserve.edu.hibernatetask.ui.commands.data_base_commands.excursion_commands;

import com.softserve.edu.hibernatetask.service.impl.MuseumExcursionService;
import com.softserve.edu.hibernatetask.ui.command_core.Command;


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


