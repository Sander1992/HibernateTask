package com.softserve.edu.hibernatetask.ui.menus;

import com.softserve.edu.hibernatetask.ui.command_core.CommandCollection;
import com.softserve.edu.hibernatetask.ui.command_core.InterfaceMenu;
import com.softserve.edu.hibernatetask.ui.command_core.Menu;
import com.softserve.edu.hibernatetask.ui.commands.data_base_commands.excursion_commands.CreateExcursionCommand;
import com.softserve.edu.hibernatetask.ui.commands.data_base_commands.excursion_commands.DeleteExcursionCommand;
import com.softserve.edu.hibernatetask.ui.commands.data_base_commands.excursion_commands.FindByNameExcursionCommand;
import com.softserve.edu.hibernatetask.ui.commands.data_base_commands.excursion_commands.GetAllExcursionsCommand;


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
