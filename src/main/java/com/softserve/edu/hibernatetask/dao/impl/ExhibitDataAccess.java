package com.softserve.edu.hibernatetask.dao.impl;

import com.softserve.edu.hibernatetask.dao.ExhibitDAO;
import com.softserve.edu.hibernatetask.entity.Exhibit;
import com.softserve.edu.hibernatetask.utils.RecordFinder;

import javax.persistence.EntityManager;
import java.util.List;

public final class ExhibitDataAccess extends BaseDataAccess<Exhibit> implements ExhibitDAO {
    public ExhibitDataAccess() {
        super(Exhibit.class);
    }

    @Override
    public List<Exhibit> findByAuthor(String author) {
        return RecordFinder.find(Exhibit.class, "author", author);
    }

    @Override
    public List<Exhibit> findByTechnic(String technic) {
        return RecordFinder.find(Exhibit.class, "technic", technic);
    }
}
