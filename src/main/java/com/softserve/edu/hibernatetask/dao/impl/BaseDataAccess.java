package com.softserve.edu.hibernatetask.dao.impl;

import com.softserve.edu.hibernatetask.dao.BaseDAO;
import com.softserve.edu.hibernatetask.utils.RecordFinder;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

import static com.softserve.edu.hibernatetask.utils.Configurator.getEntityManagerFactory;

public class BaseDataAccess<T> implements BaseDAO<T> {

    private final Class<T> entityClass;
    private final EntityManager entityManager;

    public BaseDataAccess(Class<T> table, EntityManager entityManager) {
        this.entityClass = table;
        this.entityManager = entityManager;
    }

    @Override
    public void insert(T entity) {
        entityManager.persist(entity);
    }

    @Override
    public void delete(T entity) {
        entityManager.remove(entity);
    }

    @Override
    public T merge(T entity) {

        return entityManager.merge(entity);
    }

    @Override
    public void update(T entity) {
        entityManager.refresh(entity);
    }

    @Override
    public T findById(Integer id) {
        return entityManager.find(entityClass, id);
    }

    @Override
    public List<T> findAll() {
        CriteriaQuery<T> criteriaQuery = entityManager.getCriteriaBuilder().createQuery(entityClass);
        criteriaQuery.select(criteriaQuery.from(entityClass));
        TypedQuery<T> typedQuery = entityManager.createQuery(criteriaQuery);
        return typedQuery.getResultList();
    }

    @Override
    public List<T> findByName(String name) {
        return RecordFinder.find(entityClass, "name", name, entityManager);
    }
}
