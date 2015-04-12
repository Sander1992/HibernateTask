package com.softserve.edu.hibernatetask.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public enum SessionConfigurator {
    SESSION;
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("An exception while initializing occurred");
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}


