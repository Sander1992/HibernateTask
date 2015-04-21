package com.softserve.edu.hibernatetask.ui.commandcore;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


/**
 * Class for managing collections of commands.
 */
public class CommandCollection {

    private Map<Integer, InterfaceMenuOption> menu = new TreeMap<>();

    public void addTask(InterfaceMenuOption task) {
        menu.put(menu.size() + 1, task);
    }

    public Set<Map.Entry<Integer, InterfaceMenuOption>> getCommands() {
        return menu.entrySet();
    }

    public int getSize() {
        return menu.entrySet().size();
    }

    public InterfaceMenuOption getByIndex(int index) {
        return menu.get(index);
    }
}
