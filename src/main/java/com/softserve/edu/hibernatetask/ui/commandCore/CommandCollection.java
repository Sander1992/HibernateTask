package com.softserve.edu.hibernatetask.ui.commandCore;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


/**
 * Class for managing collections of commands.
 */
public class CommandCollection {

    private Map<Integer, IMenuOption> menu = new TreeMap<>();

    public void addTask(IMenuOption task) {
        menu.put(menu.size() + 1, task);
    }

    public Set<Map.Entry<Integer, IMenuOption>> getCommands() {
        return menu.entrySet();
    }

    public int getSize() {
        return menu.entrySet().size();
    }

    public IMenuOption getByIndex(int index) {
        return menu.get(index);
    }
}