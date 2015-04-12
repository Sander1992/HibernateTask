package com.softserve.edu.hibernatetask.dao.impl;

import com.softserve.edu.hibernatetask.dao.HallDAO;
import com.softserve.edu.hibernatetask.entity.Hall;
import com.softserve.edu.hibernatetask.utils.RecordFinder;

import java.util.List;

public final class HallDataAccess extends BaseDataAccess<Hall> implements HallDAO {
    public HallDataAccess() {
        super(Hall.class);
    }

    @Override
    public List<Hall> findByResponsible(Integer respId) {
        return RecordFinder.find(Hall.class, "respId", respId.toString());
    }
}
