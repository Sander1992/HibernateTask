package com.softserve.edu.hibernatetask.ui.menus;

import com.softserve.edu.hibernatetask.ui.commandCore.CommandCollection;
import com.softserve.edu.hibernatetask.ui.commandCore.IMenu;
import com.softserve.edu.hibernatetask.ui.commandCore.Menu;
import com.softserve.edu.hibernatetask.ui.commands.dataBaseCommands.exhibitCommands.CreateExhibitCommand;
import com.softserve.edu.hibernatetask.ui.commands.dataBaseCommands.exhibitCommands.DeleteExhibitCommand;
import com.softserve.edu.hibernatetask.ui.commands.dataBaseCommands.exhibitCommands.FindByNameExhibitCommand;
import com.softserve.edu.hibernatetask.ui.commands.dataBaseCommands.exhibitCommands.GetAllExhibitsCommand;

/**
 * Created by Sander on 20.04.2015.
 */
public class ExhibitMenu implements IMenu{

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


