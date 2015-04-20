package com.softserve.edu.hibernatetask.service.impl;

import com.softserve.edu.hibernatetask.dao.BaseDAO;
import com.softserve.edu.hibernatetask.dao.impl.BaseDataAccess;
import com.softserve.edu.hibernatetask.service.BaseService;
import com.softserve.edu.hibernatetask.utils.Configurator;
import com.softserve.edu.hibernatetask.utils.RecordFinder;

import javax.persistence.EntityManager;
import java.util.List;

import static com.softserve.edu.hibernatetask.utils.Configurator.getEntityManager;

public abstract class MuseumBaseService<T> implements BaseService<T> {

    private final Class<T> entityClass;
    private final EntityManager entityManager = Configurator.getEntityManager();

    public MuseumBaseService(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    @Override
    public void insert(T entity) {
        entityManager.getTransaction().begin();
        new BaseDataAccess<T>(entityClass).insert(entity);
        entityManager.getTransaction().commit();
    }

    @Override
    public void delete(T entity) {
        entityManager.getTransaction().begin();
        BaseDAO<T> baseDAO = new BaseDataAccess(entityClass);
        baseDAO.delete(entity);
        entityManager.getTransaction().commit();
    }

    @Override
    public T merge(T entity) {
        entityManager.getTransaction().begin();
        T result = new BaseDataAccess<T>(entityClass).merge(entity);
        entityManager.getTransaction().commit();
        return result;
    }

    @Override
    public void update(T entity) {
        entityManager.getTransaction().begin();
        new BaseDataAccess<T>(entityClass).update(entity);
        entityManager.getTransaction().commit();
    }

    @Override
    public T findById(Integer id) {
        entityManager.getTransaction().begin();
        T result = new BaseDataAccess<T>(entityClass).findById(id);
        entityManager.getTransaction().commit();
        return result;
    }

    @Override
    public List<T> findAll() {
        entityManager.getTransaction().begin();
        List<T> result = new BaseDataAccess<T>(entityClass).findAll();
        entityManager.getTransaction().commit();
        return result;
    }

    @Override
    public List<T> findByName(String name) {
        return RecordFinder.find(entityClass, "name", name);
    }
}
