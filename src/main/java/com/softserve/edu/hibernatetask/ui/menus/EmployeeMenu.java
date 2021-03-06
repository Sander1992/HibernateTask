package com.softserve.edu.hibernatetask.ui.menus;

import com.softserve.edu.hibernatetask.ui.commandcore.CommandCollection;
import com.softserve.edu.hibernatetask.ui.commandcore.InterfaceMenu;
import com.softserve.edu.hibernatetask.ui.commandcore.Menu;
import com.softserve.edu.hibernatetask.ui.commands.databasecommands.employeecommands.*;


public class EmployeeMenu implements InterfaceMenu {
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

