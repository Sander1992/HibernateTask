package com.softserve.edu.hibernatetask.ui.menus;

import com.softserve.edu.hibernatetask.ui.commandCore.CommandCollection;
import com.softserve.edu.hibernatetask.ui.commandCore.IMenu;
import com.softserve.edu.hibernatetask.ui.commandCore.Menu;
import com.softserve.edu.hibernatetask.ui.commands.dataBaseCommands.excursionCommands.CreateExcursionCommand;
import com.softserve.edu.hibernatetask.ui.commands.dataBaseCommands.excursionCommands.DeleteExcursionCommand;
import com.softserve.edu.hibernatetask.ui.commands.dataBaseCommands.excursionCommands.FindByNameExcursionCommand;
import com.softserve.edu.hibernatetask.ui.commands.dataBaseCommands.excursionCommands.GetAllExcursionsCommand;

/**
 * Created by Sander on 20.04.2015.
 */
public class ExcursionMenu implements IMenu{
    @Override
    public void execute()  {
        CommandCollection excursionCommandCollection = new CommandCollection();
        excursionCommandCollection.addTask(new GetAllExcursionsCommand());
        excursionCommandCollection.addTask(new FindByNameExcursionCommand());
        excursionCommandCollection.addTask(new DeleteExcursionCommand());
        excursionCommandCollection.addTask(new CreateExcursionCommand());

        new Menu(excursionCommandCollection).runApplication();
    }

    @Override
    public String getName() {
        return "Excursion commands";
    }
}
