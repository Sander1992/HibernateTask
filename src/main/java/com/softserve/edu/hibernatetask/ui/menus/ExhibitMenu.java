package com.softserve.edu.hibernatetask.ui.menus;

import com.softserve.edu.hibernatetask.ui.command_core.CommandCollection;
import com.softserve.edu.hibernatetask.ui.command_core.InterfaceMenu;
import com.softserve.edu.hibernatetask.ui.command_core.Menu;
import com.softserve.edu.hibernatetask.ui.commands.data_base_commands.exhibit_commands.CreateExhibitCommand;
import com.softserve.edu.hibernatetask.ui.commands.data_base_commands.exhibit_commands.DeleteExhibitCommand;
import com.softserve.edu.hibernatetask.ui.commands.data_base_commands.exhibit_commands.FindByNameExhibitCommand;
import com.softserve.edu.hibernatetask.ui.commands.data_base_commands.exhibit_commands.GetAllExhibitsCommand;


public class ExhibitMenu implements InterfaceMenu {

    @Override
    public void execute()  {
        CommandCollection exhibitCommandCollection = new CommandCollection();
        exhibitCommandCollection.addTask(new GetAllExhibitsCommand());
        exhibitCommandCollection.addTask(new FindByNameExhibitCommand());
        exhibitCommandCollection.addTask(new DeleteExhibitCommand());
        exhibitCommandCollection.addTask(new CreateExhibitCommand());

        new Menu(exhibitCommandCollection).runApplication();
    }

    @Override
    public String getName() {
        return "Exhibits commands";
    }
}


