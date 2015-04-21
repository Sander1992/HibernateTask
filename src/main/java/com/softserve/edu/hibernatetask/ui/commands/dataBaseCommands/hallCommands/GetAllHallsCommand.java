package com.softserve.edu.hibernatetask.ui.commands.dataBaseCommands.hallCommands;

import com.softserve.edu.hibernatetask.service.impl.MuseumHallService;
import com.softserve.edu.hibernatetask.ui.commandCore.Command;

/**
 * Created by Sander on 21.04.2015.
 */
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
