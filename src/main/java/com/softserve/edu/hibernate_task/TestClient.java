package com.softserve.edu.hibernate_task;

/**
 * Created by Sander on 11.04.2015.
 */
import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestClient {

    public TestClient() { }
    private Employee createEmployee(Employee employee) {
        System.out.println("creating employee");
        Session session = HibernateSessionFactory.currentSession();
        Transaction tx = session.beginTransaction();
        Integer id = (Integer) session.save(employee);
        employee.setId(id);
        tx.commit();
        HibernateSessionFactory.closeSession();
        return employee;
    }
    private void updateEmployee(Employee employee) {
        System.out.println("updating employee");
        Session session = HibernateSessionFactory.currentSession();
        Transaction tx = session.beginTransaction();
        Employee dbEmploee = (Employee) session.get(Employee.class,
                            employee.getId());
        if (employee != null) {
            dbEmploee.setName(employee.getName());
            dbEmploee.setSalary(employee.getSalary());
            dbEmploee.setPosition(employee.getPosition());
        }
        session.flush();
        tx.commit();
        HibernateSessionFactory.closeSession(); }
    private void listEmployee() {
        System.out.println("listing Employee");
        Session session = HibernateSessionFactory.currentSession();
        Transaction tx = session.beginTransaction();
        List<?> employees = session.createQuery("from Employee ").list();
        for (Iterator<?> iter = employees.iterator(); iter.hasNext();) {
            Employee employee = (Employee) iter.next();
            System.out.println("Id " + employee.getId() + " Name " + employee.getName()
                    + " Sallary " + employee.getSalary() + " Position " + employee.getPosition());
        }
        tx.commit();
        HibernateSessionFactory.closeSession(); }
    public static void main(String[] args) {
        TestClient client = new TestClient();
        try {
            Employee employee = new Employee();
            employee.setName("John Anderson");
            employee.setSalary(5000);
            employee.setPosition("Director");
            employee = client.createEmployee(employee);
            System.out.println("primary key is " + employee.getId());
            client.listEmployee();
            Employee employee1 = new Employee();
            employee1.setName("Chuck Norris");
            employee1.setSalary(9001);
            employee1.setPosition("Dino Gid");
            client.createEmployee(employee1);
            client.listEmployee();
        } catch (HibernateException e) { e.printStackTrace();  }  }


}

