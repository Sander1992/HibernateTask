package com.softserve.edu.hibernatetask.ui.menus;

import com.softserve.edu.hibernatetask.ui.commandcore.CommandCollection;
import com.softserve.edu.hibernatetask.ui.commandcore.IMenu;
import com.softserve.edu.hibernatetask.ui.commandcore.Menu;
import com.softserve.edu.hibernatetask.ui.commands.dataBaseCommands.employeeCommands.GetAllEmploee;

/**
 * Created by Sander on 20.04.2015.
 */
public class EmployeeMenu implements IMenu {
        @Override
        public void execute()  {
            CommandCollection employeeCommandCollection = new CommandCollection();
            employeeCommandCollection.addTask(new GetAllEmploee());


            new Menu(employeeCommandCollection).runApplication();
        }

        @Override
        public String getName() {
            return "Employee commands";
        }
    }

