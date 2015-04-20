package com.softserve.edu.hibernatetask.ui.menus;

import com.softserve.edu.hibernatetask.ui.commandCore.CommandCollection;
import com.softserve.edu.hibernatetask.ui.commandCore.IMenu;
import com.softserve.edu.hibernatetask.ui.commandCore.Menu;
import com.softserve.edu.hibernatetask.ui.commands.dataBaseCommands.employeeCommands.CreateEmployeeCommand;
import com.softserve.edu.hibernatetask.ui.commands.dataBaseCommands.employeeCommands.DeleteEmployeeCommand;
import com.softserve.edu.hibernatetask.ui.commands.dataBaseCommands.employeeCommands.FindByNameEmployeeCommand;
import com.softserve.edu.hibernatetask.ui.commands.dataBaseCommands.employeeCommands.GetAllEmploeeCommand;

/**
 * Created by Sander on 20.04.2015.
 */
public class EmployeeMenu implements IMenu {
        @Override
        public void execute()  {
            CommandCollection employeeCommandCollection = new CommandCollection();
            employeeCommandCollection.addTask(new GetAllEmploeeCommand());
            employeeCommandCollection.addTask(new DeleteEmployeeCommand());
            employeeCommandCollection.addTask(new CreateEmployeeCommand());
            employeeCommandCollection.addTask(new FindByNameEmployeeCommand());


            new Menu(employeeCommandCollection).runApplication();
        }

        @Override
        public String getName() {
            return "Employee commands";
        }
    }

