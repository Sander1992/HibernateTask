package com.softserve.edu.hibernatetask.dao;

import java.util.List;

public interface BaseDAO<T> {
    void insert(T entity);
    void delete(T entity);
    T merge(T entity);
    void update(T entity);
    T findById(Integer id);
    List<T> findAll();
    List<T> findByName(String name);
}
