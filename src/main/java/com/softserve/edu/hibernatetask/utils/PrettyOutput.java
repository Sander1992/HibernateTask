package com.softserve.edu.hibernatetask.utils;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class PrettyOutput {
    private static final int WIDTH = 25;
    private static final int MAX_NUMBER_OF_FIELDS = 6;

    public static void displayDelimiter() {
        for (int i = 0; i < WIDTH * MAX_NUMBER_OF_FIELDS; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void displayInfo(String info) {
        displayDelimiter();
        System.out.printf("%" + WIDTH * MAX_NUMBER_OF_FIELDS / 2 + "s\n", info);
        displayDelimiter();
    }

    public static void displayColumns(Object... columns) {
        for (Object column : columns) {
            System.out.printf("%-" + WIDTH + "s", column);
        }
        System.out.println();
    }

    public static void disableLogger() {
        Logger.getLogger("org.hibernate").setLevel(Level.OFF);
    }
}
