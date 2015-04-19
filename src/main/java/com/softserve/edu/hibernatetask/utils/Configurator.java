package com.softserve.edu.hibernatetask.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Configurator {
    private static final EntityManagerFactory entityManagerFactory = buildEntityManagerFactory();

    private static EntityManagerFactory buildEntityManagerFactory() {
        try {
            return Persistence.createEntityManagerFactory("MainUnit");
        } catch (Throwable ex) {
            System.err.println("An exception while initializing occurred");
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public static void closeSession() {
        entityManagerFactory.close();
    }
}
