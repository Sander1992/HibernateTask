package com.softserve.edu.hibernatetask.ui.commands.data_base_commands.exhibit_commands;

import com.softserve.edu.hibernatetask.service.impl.MuseumExhibitService;
import com.softserve.edu.hibernatetask.ui.command_core.Command;


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


