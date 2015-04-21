package com.softserve.edu.hibernatetask.ui.menus;

import com.softserve.edu.hibernatetask.ui.commandcore.CommandCollection;
import com.softserve.edu.hibernatetask.ui.commandcore.InterfaceMenu;
import com.softserve.edu.hibernatetask.ui.commandcore.Menu;


public class MainMenu implements InterfaceMenu {
    @Override
    public void execute()  {
        CommandCollection menuCollection = new CommandCollection();
        menuCollection.addTask(new EmployeeMenu());
        menuCollection.addTask(new ExcursionMenu());
        menuCollection.addTask((new ExhibitMenu()));
        menuCollection.addTask(new HallMenu());

        new Menu(menuCollection).runApplication();
    }

    @Override
    public String getName() {
        return "menu commands";
    }
}