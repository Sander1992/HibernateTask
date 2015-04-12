package com.softserve.edu.hibernatetask.dao;

import com.softserve.edu.hibernatetask.entity.Exhibit;

import java.util.List;

public interface ExhibitDAO extends BaseDAO<Exhibit> {
    List<Exhibit> findByAuthor(String author);
    List<Exhibit> findByTechnic(String technic);
}
