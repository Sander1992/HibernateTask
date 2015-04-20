package com.softserve.edu.hibernatetask.ui.menus;

import com.softserve.edu.hibernatetask.ui.commandCore.CommandCollection;
import com.softserve.edu.hibernatetask.ui.commandCore.IMenu;
import com.softserve.edu.hibernatetask.ui.commandCore.Menu;

/**
 * Created by Oleg on 09.04.2015.
 */
public class MainMenu implements IMenu {
    @Override
    public void execute()  {
        CommandCollection menuCollection = new CommandCollection();
        menuCollection.addTask(new EmployeeMenu());
        menuCollection.addTask(new ExcursionMenu());

        new Menu(menuCollection).runApplication();
    }

    @Override
    public String getName() {
        return "menu commands";
    }
}