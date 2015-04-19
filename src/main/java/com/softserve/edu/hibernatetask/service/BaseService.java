package com.softserve.edu.hibernatetask.service;

import com.softserve.edu.hibernatetask.utils.PrettyOutput;

import java.util.List;

public interface BaseService<T> {
    void insert(T entity);
    void delete(T entity);
    T merge(T entity);
    void update(T entity);
    T findById(Integer id);
    List<T> findAll();
    List<T> findByName(String name);
    void showInfo();
}
