package com.softserve.edu.hibernatetask.dao.impl;

import com.softserve.edu.hibernatetask.dao.BaseDAO;
import com.softserve.edu.hibernatetask.utils.RecordFinder;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.beans.Expression;
import java.util.List;

import static com.softserve.edu.hibernatetask.utils.SessionConfigurator.getSessionFactory;

public abstract class BaseDataAccess<T> implements BaseDAO<T> {

    private final Class<?> table;

    public BaseDataAccess(Class<?> table) {
        this.table = table;
    }

    @Override
    public Integer insert(T entity) {
        Session session = getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        try {
            Integer result = (Integer) session.save(entity);
            tx.commit();
            return result;
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
            throw new AssertionError(ex);
        } finally {
            session.close();
        }
    }

    @Override
    public void delete(T entity) {
        Session session = getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        try {
            session.delete(entity);
            tx.commit();
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
            throw new AssertionError(ex);
        } finally {
            session.close();
        }
    }

    @Override
    public void update(T entity) {
        Session session = getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        try {
            session.update(entity);
            tx.commit();
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
            throw new AssertionError(ex);
        } finally {
            session.close();
        }
    }

    public T merge(T entity) {
        Session session = getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        try {
            @SuppressWarnings("unchecked")
            T result = (T) session.merge(entity);
            tx.commit();
            return result;
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
            throw new AssertionError(ex);
        } finally {
            session.close();
        }
    }

    @Override
    public T findById(Integer id) {
        Session session = getSessionFactory().openSession();
        @SuppressWarnings("unchecked")
        T result = (T) session.get(table, id);
        session.close();
        return result;
    }

    @Override
    public List<T> findAll() {
        Session session = getSessionFactory().openSession();
        List<T> result = session
                .createQuery("from " + table.getName()).list();
        session.close();
        return result;
    }

    @Override
    public List<T> findByName(String name) {
        return RecordFinder.find(table, "name", name);
    }
}
