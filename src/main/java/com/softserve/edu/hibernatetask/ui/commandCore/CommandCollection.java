package com.softserve.edu.hibernatetask.ui.commandCore;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


/**
 * Class for managing collections of commands.
 */
public class CommandCollection {

    private Map<Integer, com.softserve.edu.hibernatetask.ui.commandCore.IMenuOption> menu = new TreeMap<>();

    public void addTask(com.softserve.edu.hibernatetask.ui.commandCore.IMenuOption task) {
        menu.put(menu.size() + 1, task);
    }

    public Set<Map.Entry<Integer, com.softserve.edu.hibernatetask.ui.commandCore.IMenuOption>> getCommands() {
        return menu.entrySet();
    }

    public int getSize() {
        return menu.entrySet().size();
    }

    public com.softserve.edu.hibernatetask.ui.commandCore.IMenuOption getByIndex(int index) {
        return menu.get(index);
    }
}
