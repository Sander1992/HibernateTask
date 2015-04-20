package com.softserve.edu.hibernatetask.ui.commands.dataBaseCommands.employeeCommands;

import com.softserve.edu.hibernatetask.service.impl.MuseumEmployeeService;
import com.softserve.edu.hibernatetask.ui.commandcore.Command;

/**
 * Created by Sander on 20.04.2015.
 */
public class GetAllEmploee implements Command{
    @Override
    public void execute() {
        new MuseumEmployeeService().showAll();
    }

    @Override
    public String getName() {
        return "Get all employees";
    }
}
