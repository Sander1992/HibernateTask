package com.softserve.edu.hibernatetask.ui.commands.databasecommands.employeecommands;

import com.softserve.edu.hibernatetask.service.impl.MuseumEmployeeService;
import com.softserve.edu.hibernatetask.ui.commandcore.Command;

public class GetAllEmploeeCommand implements Command{
    @Override
    public void execute() {
        new MuseumEmployeeService().showAll();
    }

    @Override
    public String getName() {
        return "Get all employees";
    }
}
