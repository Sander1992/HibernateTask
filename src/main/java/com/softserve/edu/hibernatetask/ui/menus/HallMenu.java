package com.softserve.edu.hibernatetask.ui.menus;

import com.softserve.edu.hibernatetask.ui.commandCore.CommandCollection;
import com.softserve.edu.hibernatetask.ui.commandCore.IMenu;
import com.softserve.edu.hibernatetask.ui.commandCore.Menu;
import com.softserve.edu.hibernatetask.ui.commands.dataBaseCommands.hallCommands.CreateHallCommand;
import com.softserve.edu.hibernatetask.ui.commands.dataBaseCommands.hallCommands.DeleteHallCommand;
import com.softserve.edu.hibernatetask.ui.commands.dataBaseCommands.hallCommands.FindByIDHallCommand;
import com.softserve.edu.hibernatetask.ui.commands.dataBaseCommands.hallCommands.GetAllHallsCommand;

/**
 * Created by Sander on 20.04.2015.
 */
public class HallMenu implements IMenu {

    @Override
    public void execute()  {
        CommandCollection hallCommandCollection = new CommandCollection();
        hallCommandCollection.addTask(new GetAllHallsCommand());
        hallCommandCollection.addTask(new FindByIDHallCommand());
        hallCommandCollection.addTask(new DeleteHallCommand());
        hallCommandCollection.addTask(new CreateHallCommand());

        new Menu(hallCommandCollection).runApplication();
    }

    @Override
    public String getName() {
        return "Hall commands";
    }
}