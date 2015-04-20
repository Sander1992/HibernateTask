package com.softserve.edu.hibernatetask.ui.menus;

import com.softserve.edu.hibernatetask.ui.commandCore.CommandCollection;
import com.softserve.edu.hibernatetask.ui.commandCore.IMenu;
import com.softserve.edu.hibernatetask.ui.commandCore.Menu;
import com.softserve.edu.hibernatetask.ui.commands.dataBaseCommands.employeeCommands.*;

/**
 * Created by Sander on 20.04.2015.
 */
public class EmployeeMenu implements IMenu {
        @Override
        public void execute()  {
            CommandCollection employeeCommandCollection = new CommandCollection();
            employeeCommandCollection.addTask(new GetAllEmploeeCommand());
            employeeCommandCollection.addTask(new DeleteByNameEmployeeCommand());
            employeeCommandCollection.addTask(new DeleteByIdEmployeeCommand());
            employeeCommandCollection.addTask(new CreateEmployeeCommand());
            employeeCommandCollection.addTask(new FindByNameEmployeeCommand());
            employeeCommandCollection.addTask(new FindByIDEmployeeCommand());



            new Menu(employeeCommandCollection).runApplication();
        }

        @Override
        public String getName() {
            return "Employee commands";
        }
    }

