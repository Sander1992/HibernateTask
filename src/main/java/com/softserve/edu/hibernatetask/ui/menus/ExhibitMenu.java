package com.softserve.edu.hibernatetask.ui.menus;

import com.softserve.edu.hibernatetask.ui.commandcore.CommandCollection;
import com.softserve.edu.hibernatetask.ui.commandcore.InterfaceMenu;
import com.softserve.edu.hibernatetask.ui.commandcore.Menu;
import com.softserve.edu.hibernatetask.ui.commands.databasecommands.exhibitcommands.CreateExhibitCommand;
import com.softserve.edu.hibernatetask.ui.commands.databasecommands.exhibitcommands.DeleteExhibitCommand;
import com.softserve.edu.hibernatetask.ui.commands.databasecommands.exhibitcommands.FindByNameExhibitCommand;
import com.softserve.edu.hibernatetask.ui.commands.databasecommands.exhibitcommands.GetAllExhibitsCommand;


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


