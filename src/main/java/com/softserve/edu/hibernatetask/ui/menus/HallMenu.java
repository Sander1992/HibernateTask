package com.softserve.edu.hibernatetask.ui.menus;

import com.softserve.edu.hibernatetask.ui.commandcore.CommandCollection;
import com.softserve.edu.hibernatetask.ui.commandcore.InterfaceMenu;
import com.softserve.edu.hibernatetask.ui.commandcore.Menu;
import com.softserve.edu.hibernatetask.ui.commands.databasecommands.hallcommands.CreateHallCommand;
import com.softserve.edu.hibernatetask.ui.commands.databasecommands.hallcommands.DeleteHallCommand;
import com.softserve.edu.hibernatetask.ui.commands.databasecommands.hallcommands.FindByIDHallCommand;
import com.softserve.edu.hibernatetask.ui.commands.databasecommands.hallcommands.GetAllHallsCommand;


public class HallMenu implements InterfaceMenu {

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