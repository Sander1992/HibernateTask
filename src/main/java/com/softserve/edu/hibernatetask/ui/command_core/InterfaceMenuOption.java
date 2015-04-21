package com.softserve.edu.hibernatetask.ui.command_core;

/**
 * Interface that every menu option must implement
 */
public interface InterfaceMenuOption {
    /**
     * Called when the menu option is selected
     */
    void execute();

    /**
     * @return string that will be shown in menu for this menu option
     */
    String getName();
}