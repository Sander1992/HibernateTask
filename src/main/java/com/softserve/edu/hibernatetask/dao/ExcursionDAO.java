package com.softserve.edu.hibernatetask.dao;

import com.softserve.edu.hibernatetask.entity.Excursion;

import java.util.List;

public interface ExcursionDAO extends BaseDAO<Excursion> {
    List<Excursion> findByScheldule(String scheldule);
}
