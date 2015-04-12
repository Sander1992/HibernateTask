package com.softserve.edu.hibernatetask.dao;

import com.softserve.edu.hibernatetask.entity.Hall;

import java.util.List;

public interface HallDAO extends BaseDAO<Hall> {
    List<Hall> findByResponsible(Integer respId);
}
