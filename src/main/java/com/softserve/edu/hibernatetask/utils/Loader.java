package com.softserve.edu.hibernatetask.utils;

public final class Loader {
    public static void loadConfiguration() {
        new Thread(() -> Configurator.load()).start();
    }
}
