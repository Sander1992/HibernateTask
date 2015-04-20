package com.softserve.edu.hibernatetask.dao;

import com.softserve.edu.hibernatetask.entity.MuseumEntity;

import java.util.List;

public interface BaseDAO<T extends MuseumEntity> {
    void insert(T entity);
    void delete(T entity);
    T merge(T entity);
    void update(T entity);
    T toManaged(T entity);
    T findById(Integer id);
    List<T> findAll();
    List<T> findByName(String name);
}
