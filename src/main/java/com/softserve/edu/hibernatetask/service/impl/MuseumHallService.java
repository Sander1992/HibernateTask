package com.softserve.edu.hibernatetask.service.impl;

import com.softserve.edu.hibernatetask.dao.impl.BaseDataAccess;
import com.softserve.edu.hibernatetask.entity.Hall;
import com.softserve.edu.hibernatetask.service.HallService;
import com.softserve.edu.hibernatetask.utils.Configurator;

import javax.persistence.EntityManager;
import java.util.List;

import static com.softserve.edu.hibernatetask.utils.PrettyOutput.*;

public final class MuseumHallService extends MuseumBaseService<Hall> implements HallService {
    private final EntityManager entityManager = Configurator.getEntityManager();

    public MuseumHallService() {
        super(Hall.class);
    }

    @Override
    public void showAll() {
        List<Hall> employees = new BaseDataAccess<Hall>(Hall.class).findAll();
        displayInfo("Halls of our museum");
        displayColumns("Id", "Name", "Responsible staff");
        displayDelimiter();
        employees.forEach(e -> displayColumns(e.getId(), e.getName(), e.getEmployees()));
        displayDelimiter();
    }
}
