package com.softserve.edu.hibernatetask.ui.commands.data_base_commands.hall_commands;

import com.softserve.edu.hibernatetask.service.impl.MuseumHallService;
import com.softserve.edu.hibernatetask.ui.command_core.Command;


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
