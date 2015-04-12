package com.softserve.edu.hibernatetask.utils;

import org.hibernate.Session;

import java.util.List;

import static com.softserve.edu.hibernatetask.utils.SessionConfigurator.getSessionFactory;

public final class RecordFinder {
    public static List find(Class<?> table, String column, String key) {
        Session session = getSessionFactory().openSession();
        List result = session
                .createQuery("from " + table.getName() + " E where E." + column + "='" + key + "'").list();
        session.close();
        return result;
    }
}
