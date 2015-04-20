package com.softserve.edu.hibernatetask.ui.commandcore;

import com.softserve.edu.hibernatetask.ui.commands.ExitMenuCommand;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Class which create program menu.
 */
public class Menu {
    public static final int MIN_MENU_INDEX = 0;
    private CommandCollection commandCollection = new CommandCollection();

    public Menu(CommandCollection commandCollection) {
        this.setCommandCollection(commandCollection);
        addExitMenuOptionIfAbsent();
    }

    private void addExitMenuOptionIfAbsent() {
        Iterator<Map.Entry<Integer, IMenuOption>> iterator = commandCollection.getCommands().iterator();

        boolean contains = false;

        while (iterator.hasNext()) {
            if (iterator.next().getValue() instanceof ExitMenuCommand) {
                contains = true;
                break;
            }
        }

        if (!contains) {
            commandCollection.addTask(new ExitMenuCommand());
        }
    }

    private void printEntryMessages() {
        StringBuilder messageBuilder = new StringBuilder();
        for (Map.Entry<Integer, IMenuOption> pair : commandCollection.getCommands()) {
            messageBuilder.append(pair.getKey());
            messageBuilder.append(": ");
            messageBuilder.append(pair.getValue().getName());
            messageBuilder.append(System.lineSeparator());
        }

        System.out.println();
        System.out.println(messageBuilder);
        System.out.println();
    }

    public void runApplication() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printEntryMessages();
            int programType = scanner.nextInt();

            if (programType > MIN_MENU_INDEX && programType < (commandCollection.getSize() + 1)) {
                IMenuOption menuOption = commandCollection.getByIndex(programType);

                if (menuOption instanceof ExitMenuCommand) {
                    break;
                } else {
                    menuOption.execute();
                }
            } else {
                System.out.println("insert correct index");
            }
        }  // while
    }

    public void setCommandCollection(CommandCollection commandCollection) {
        this.commandCollection = commandCollection;
    }
}