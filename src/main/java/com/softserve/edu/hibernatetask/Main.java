package com.softserve.edu.hibernatetask;

import com.softserve.edu.hibernatetask.ui.menus.MainMenu;
import com.softserve.edu.hibernatetask.utils.Configurator;
import com.softserve.edu.hibernatetask.utils.PrettyOutput;

/**
 * Class for running application
 */
public class Main {
    public static void main(String[] args) {
        try {
            PrettyOutput.disableLogger();
            Configurator.load();
            MainMenu mainMenu = new MainMenu();
            mainMenu.execute();
        } finally {
            Configurator.closeSession();
        }
    }
}