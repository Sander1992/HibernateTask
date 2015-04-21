package com.softserve.edu.hibernatetask.ui.menus;

import com.softserve.edu.hibernatetask.ui.command_core.CommandCollection;
import com.softserve.edu.hibernatetask.ui.command_core.InterfaceMenu;
import com.softserve.edu.hibernatetask.ui.command_core.Menu;
import com.softserve.edu.hibernatetask.ui.commands.data_base_commands.employee_commands.*;


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

