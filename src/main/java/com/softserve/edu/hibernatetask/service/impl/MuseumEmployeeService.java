package com.softserve.edu.hibernatetask.service.impl;

import com.softserve.edu.hibernatetask.dao.EmployeeDAO;
import com.softserve.edu.hibernatetask.dao.HallDAO;
import com.softserve.edu.hibernatetask.dao.impl.EmployeeDataAccess;
import com.softserve.edu.hibernatetask.dao.impl.HallDataAccess;
import com.softserve.edu.hibernatetask.entity.Employee;
import com.softserve.edu.hibernatetask.entity.Hall;
import com.softserve.edu.hibernatetask.service.EmployeeService;
import com.softserve.edu.hibernatetask.utils.Configurator;

import javax.persistence.EntityManager;
import java.util.List;

import static com.softserve.edu.hibernatetask.utils.PrettyOutput.*;

public final class MuseumEmployeeService extends MuseumBaseService<Employee> implements EmployeeService {
    private final EntityManager entityManager = Configurator.getEntityManager();

    public MuseumEmployeeService() {
        super(Employee.class);
    }

    @Override
    public void showAll() {
        List<Employee> employees = findAll();
        displayInfo("Our staff");
        displayColumns("Name", "Position");
        displayDelimiter();
        employees.forEach(e -> displayColumns(e.getName(), e.getPosition()));
        displayDelimiter();
    }

    @Override
    public void delete(Employee entity) {
        EmployeeDAO employeeDAO = new EmployeeDataAccess();
        employeeDAO.update(entity);
        entityManager.getTransaction().begin();
        HallDAO hallDAO = new HallDataAccess();
        for (Hall e : entity.getHalls()) {
            e.getEmployees().remove(entity);
        }
        employeeDAO.delete(entity);
        entityManager.getTransaction().commit();
    }
}
