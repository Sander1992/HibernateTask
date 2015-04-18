package com.softserve.edu.hibernatetask.dao.impl;

import com.softserve.edu.hibernatetask.dao.ExcursionDAO;
import com.softserve.edu.hibernatetask.entity.Employee;
import com.softserve.edu.hibernatetask.entity.Excursion;
import com.softserve.edu.hibernatetask.utils.RecordFinder;

import javax.persistence.EntityManager;
import java.util.List;

public final class ExcursionDataAccess extends BaseDataAccess<Excursion> implements ExcursionDAO {
    private final EntityManager entityManager;
    public ExcursionDataAccess(EntityManager entityManager) {
        super(Excursion.class, entityManager);
        this.entityManager = entityManager;
    }

    @Override
    public List<Excursion> findByScheldule(String scheldule) {
        return RecordFinder.find(Excursion.class, "scheldule", scheldule, entityManager);
    }
}
