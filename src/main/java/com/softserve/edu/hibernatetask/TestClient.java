package com.softserve.edu.hibernatetask;

import com.softserve.edu.hibernatetask.entity.Employee;
import com.softserve.edu.hibernatetask.utils.SessionConfigurator;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Iterator;
import java.util.List;

public class TestClient {

    public TestClient() {
    }

    private Employee createEmployee(Employee employee) {
        System.out.println("creating employee");
        Session session = SessionConfigurator.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Integer id = (Integer) session.save(employee);
        employee.setEmplId(id);
        tx.commit();
        session.close();
        return employee;
    }

    private void updateEmployee(Employee employee) {
        System.out.println("updating employee");
        Session session = SessionConfigurator.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Employee dbEmploee = (Employee) session.get(Employee.class,
                employee.getEmplId());
        if (employee != null) {
            dbEmploee.setName(employee.getName());
            dbEmploee.setSalary(employee.getSalary());
            dbEmploee.setPosition(employee.getPosition());
        }
        session.flush();
        tx.commit();
        session.close();
    }

    private void listEmployee() {
        System.out.println("listing Employee");
        Session session = SessionConfigurator.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        List<?> employees = session.createQuery("from Employee ").list();
        for (Iterator<?> iter = employees.iterator(); iter.hasNext(); ) {
            Employee employee = (Employee) iter.next();
            System.out.println("Id " + employee.getEmplId() + " Name " + employee.getName()
                    + " Sallary " + employee.getSalary() + " Position " + employee.getPosition());
        }
        tx.commit();
        session.close();
    }

    public static void main(String[] args) {
        TestClient client = new TestClient();
        try {
            Employee employee = new Employee();
            employee.setName("John Anderson");
            employee.setSalary(5000);
            employee.setPosition("Director");
            employee = client.createEmployee(employee);
            System.out.println("primary key is " + employee.getEmplId());
            client.listEmployee();
            Employee employee1 = new Employee();
            employee1.setName("Chuck Norris");
            employee1.setSalary(9001);
            employee1.setPosition("Dino Gid");
            client.createEmployee(employee1);
            client.listEmployee();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }
}

