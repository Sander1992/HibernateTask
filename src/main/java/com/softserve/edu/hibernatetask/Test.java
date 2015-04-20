package com.softserve.edu.hibernatetask;

import com.softserve.edu.hibernatetask.utils.Configurator;
import com.softserve.edu.hibernatetask.utils.TableFiller;

public class Test {
    public static void main(String[] args) {
        try {
            TableFiller.fillWithEmployees();
            TableFiller.fillWithExcursion();
            TableFiller.fillWithExhibits();
            TableFiller.fillWithHalls();
        } finally {
            Configurator.closeSession();
        }
    }
}
