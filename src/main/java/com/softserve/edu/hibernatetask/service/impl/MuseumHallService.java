package com.softserve.edu.hibernatetask.service.impl;

import com.softserve.edu.hibernatetask.dao.impl.BaseDataAccess;
import com.softserve.edu.hibernatetask.dao.impl.HallDataAccess;
import com.softserve.edu.hibernatetask.entity.Hall;
import com.softserve.edu.hibernatetask.service.HallService;
import com.softserve.edu.hibernatetask.utils.Configurator;

import javax.persistence.EntityManager;
import java.util.List;

import static com.softserve.edu.hibernatetask.utils.Configurator.getEntityManagerFactory;
import static com.softserve.edu.hibernatetask.utils.PrettyOutput.*;

public final class MuseumHallService extends MuseumBaseService<Hall> implements HallService {
    public MuseumHallService() {
        super(Hall.class);
    }

    @Override
    public void showAll() {
        EntityManager entityManager = Configurator.getEntityManagerFactory().createEntityManager();
        try {
            entityManager.getTransaction().begin();
            List<Hall> employees = new BaseDataAccess<Hall>(Hall.class, entityManager).findAll();
            displayInfo("Halls of our museum");
            displayColumns("Name", "Responsible staff");
            displayDelimiter();
            employees.forEach(e -> displayColumns(e.getName(), e.getEmployees()));
            displayDelimiter();
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }
    }
}
