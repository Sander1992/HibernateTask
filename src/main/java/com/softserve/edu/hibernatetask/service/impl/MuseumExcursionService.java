package com.softserve.edu.hibernatetask.service.impl;

import com.softserve.edu.hibernatetask.dao.impl.EmployeeDataAccess;
import com.softserve.edu.hibernatetask.dao.impl.ExcursionDataAccess;
import com.softserve.edu.hibernatetask.entity.Excursion;
import com.softserve.edu.hibernatetask.service.ExcursionService;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Set;

import static com.softserve.edu.hibernatetask.utils.Configurator.getEntityManagerFactory;
import static com.softserve.edu.hibernatetask.utils.PrettyOutput.*;

public final class MuseumExcursionService extends MuseumBaseService<Excursion> implements ExcursionService {
    public MuseumExcursionService() {
        super(Excursion.class);
    }

    @Override
    public void showInfo() {
        List<Excursion> employees = findAll();
        displayInfo("Excursions available");
        displayColumns("Name", "Schedule", "Duration", "Responsible");
        displayDelimiter();
        employees.forEach(e -> displayColumns(e.getName(), e.getSchedule(),
                e.getDuration(), e.getEmployee()));
        displayDelimiter();
    }

    @Override
    public void insert(Excursion entity) {
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entity.setEmployee(new EmployeeDataAccess(entityManager).getManaged(entity.getEmployee()));
            new ExcursionDataAccess(entityManager).insert(entity);
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }
    }
}
