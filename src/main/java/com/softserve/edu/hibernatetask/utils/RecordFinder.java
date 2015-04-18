package com.softserve.edu.hibernatetask.utils;

import com.softserve.edu.hibernatetask.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.EntityType;
import java.util.List;

import static com.softserve.edu.hibernatetask.utils.Configurator.getEntityManagerFactory;

public final class RecordFinder {
    public static <T> List<T> find(Class<T> entityClass, String column, String key, EntityManager entityManager) {
        CriteriaQuery<T> criteriaQuery = entityManager.getCriteriaBuilder().createQuery(entityClass);
        Root<T> root = criteriaQuery.from(entityClass);
        criteriaQuery.where(root.get(column).in(key));
        TypedQuery<T> typedQuery = entityManager.createQuery(criteriaQuery);
        return typedQuery.getResultList();
    }
}
