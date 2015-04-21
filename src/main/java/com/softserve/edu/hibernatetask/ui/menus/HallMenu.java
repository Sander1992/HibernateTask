package com.softserve.edu.hibernatetask.ui.menus;

import com.softserve.edu.hibernatetask.ui.command_core.CommandCollection;
import com.softserve.edu.hibernatetask.ui.command_core.InterfaceMenu;
import com.softserve.edu.hibernatetask.ui.command_core.Menu;
import com.softserve.edu.hibernatetask.ui.commands.data_base_commands.hall_commands.CreateHallCommand;
import com.softserve.edu.hibernatetask.ui.commands.data_base_commands.hall_commands.DeleteHallCommand;
import com.softserve.edu.hibernatetask.ui.commands.data_base_commands.hall_commands.FindByIDHallCommand;
import com.softserve.edu.hibernatetask.ui.commands.data_base_commands.hall_commands.GetAllHallsCommand;


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