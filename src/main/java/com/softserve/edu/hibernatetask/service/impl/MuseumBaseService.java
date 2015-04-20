package com.softserve.edu.hibernatetask.service.impl;

import com.softserve.edu.hibernatetask.dao.BaseDAO;
import com.softserve.edu.hibernatetask.dao.impl.BaseDataAccess;
import com.softserve.edu.hibernatetask.entity.MuseumEntity;
import com.softserve.edu.hibernatetask.service.BaseService;
import com.softserve.edu.hibernatetask.utils.RecordFinder;

import javax.persistence.EntityManager;
import java.util.List;

import static com.softserve.edu.hibernatetask.utils.Configurator.getEntityManagerFactory;

public abstract class MuseumBaseService<T extends MuseumEntity> implements BaseService<T> {

    private final Class<T> entityClass;

    public MuseumBaseService(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    @Override
    public void persist(T entity) {
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        try {
            entityManager.getTransaction().begin();
            new BaseDataAccess<T>(entityClass, entityManager).insert(entity);
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }
    }

    @Override
    public void delete(T entity) {
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        try {
            entityManager.getTransaction().begin();
            BaseDAO<T> baseDAO = new BaseDataAccess(entityClass, entityManager);
            baseDAO.delete(baseDAO.toManaged(entity));
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }
    }

    @Override
    public T insert(T entity) {
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        try {
            entityManager.getTransaction().begin();
            T result = new BaseDataAccess<T>(entityClass, entityManager).merge(entity);
            entityManager.getTransaction().commit();
            return result;
        } finally {
            entityManager.close();
        }
    }

    @Override
    public void update(T entity) {
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        try {
            entityManager.getTransaction().begin();
            new BaseDataAccess<T>(entityClass, entityManager).update(entity);
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }
    }

    @Override
    public T findById(Integer id) {
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        try {
            entityManager.getTransaction().begin();
            T result = new BaseDataAccess<T>(entityClass, entityManager).findById(id);
            entityManager.getTransaction().commit();
            return result;
        } finally {
            entityManager.close();
        }
    }

    @Override
    public List<T> findAll() {
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        try {
            entityManager.getTransaction().begin();
            List<T> result = new BaseDataAccess<T>(entityClass, entityManager).findAll();
            entityManager.getTransaction().commit();
            return result;
        } finally {
            entityManager.close();
        }
    }

    @Override
    public List<T> findByName(String name) {
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        try {
            return RecordFinder.find(entityClass, "name", name, entityManager);
        } finally {
            entityManager.close();
        }
    }
}
