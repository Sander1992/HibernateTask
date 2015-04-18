package com.softserve.edu.hibernatetask.dao.impl;

import com.softserve.edu.hibernatetask.dao.HallDAO;
import com.softserve.edu.hibernatetask.entity.Exhibit;
import com.softserve.edu.hibernatetask.entity.Hall;
import com.softserve.edu.hibernatetask.utils.RecordFinder;

import javax.persistence.EntityManager;
import java.util.List;

public final class HallDataAccess extends BaseDataAccess<Hall> implements HallDAO {
    private final EntityManager entityManager;

    public HallDataAccess(EntityManager entityManager) {
        super(Hall.class, entityManager);
        this.entityManager = entityManager;
    }

    @Override
    public List<Hall> findByResponsible(Integer respId) {
        return RecordFinder.find(Hall.class, "respId", respId.toString(), entityManager);
    }
}
