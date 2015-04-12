package com.softserve.edu.hibernatetask.dao.impl;

import com.softserve.edu.hibernatetask.dao.ExcursionDAO;
import com.softserve.edu.hibernatetask.entity.Excursion;
import com.softserve.edu.hibernatetask.utils.RecordFinder;

import java.util.List;

public final class ExcursionDataAccess extends BaseDataAccess<Excursion> implements ExcursionDAO {
    public ExcursionDataAccess() {
        super(Excursion.class);
    }

    @Override
    public List<Excursion> findByScheldule(String scheldule) {
        return RecordFinder.find(Excursion.class, "scheldule", scheldule);
    }
}
