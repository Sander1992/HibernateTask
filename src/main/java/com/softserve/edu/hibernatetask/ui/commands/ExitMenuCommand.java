package com.softserve.edu.hibernatetask.ui.commands;

import com.softserve.edu.hibernatetask.ui.commandcore.Command;


public class ExitMenuCommand implements Command {
    @Override
    public void execute() {
        // not needed for this class
    }

    @Override
    public String getName() {
        return "Exit menu";
    }
}