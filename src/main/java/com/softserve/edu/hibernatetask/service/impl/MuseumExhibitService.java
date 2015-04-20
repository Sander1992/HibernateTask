package com.softserve.edu.hibernatetask.service.impl;

import com.softserve.edu.hibernatetask.entity.Exhibit;
import com.softserve.edu.hibernatetask.service.ExhibitService;
import com.softserve.edu.hibernatetask.utils.DateHandler;

import java.util.List;

import static com.softserve.edu.hibernatetask.utils.PrettyOutput.*;

public final class MuseumExhibitService extends MuseumBaseService<Exhibit> implements ExhibitService {
    public MuseumExhibitService() {
        super(Exhibit.class);
    }

    @Override
    public void showAll() {
        List<Exhibit> employees = findAll();
        displayInfo("Exhibits of our museum");
        displayColumns("Name", "Date", "Hall", "Author", "Material", "Technic");
        displayDelimiter();
        employees.forEach(e -> displayColumns(e.getName(), DateHandler.getPrettyDate(e.getDate()),
                e.getHall(), e.getAuthor(), e.getMaterial(), e.getTechnic()));
        displayDelimiter();
    }
}
