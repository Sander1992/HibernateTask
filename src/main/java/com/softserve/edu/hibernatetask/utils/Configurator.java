package com.softserve.edu.hibernatetask.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public final class Configurator {
    private static final EntityManagerFactory entityManagerFactory = buildEntityManagerFactory();
    private static final EntityManager entityManager = entityManagerFactory.createEntityManager();

    private static EntityManagerFactory buildEntityManagerFactory() {
        try {
            return Persistence.createEntityManagerFactory("MainUnit");
        } catch (Throwable ex) {
            System.err.println("An exception while initializing occurred");
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static EntityManager getEntityManager() {
        return entityManager;
    }

    public static void closeSession() {
        entityManager.close();
        entityManagerFactory.close();
    }

    /*
    For background loading sake.
     */
    public static void load() {
    }
}
