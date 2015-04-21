package com.softserve.edu.hibernatetask.ui.menus;

import com.softserve.edu.hibernatetask.ui.commandcore.CommandCollection;
import com.softserve.edu.hibernatetask.ui.commandcore.InterfaceMenu;
import com.softserve.edu.hibernatetask.ui.commandcore.Menu;
import com.softserve.edu.hibernatetask.ui.commands.databasecommands.excursioncommands.CreateExcursionCommand;
import com.softserve.edu.hibernatetask.ui.commands.databasecommands.excursioncommands.DeleteExcursionCommand;
import com.softserve.edu.hibernatetask.ui.commands.databasecommands.excursioncommands.FindByNameExcursionCommand;
import com.softserve.edu.hibernatetask.ui.commands.databasecommands.excursioncommands.GetAllExcursionsCommand;


public class ExcursionMenu implements InterfaceMenu {
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
