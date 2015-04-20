package com.softserve.edu.hibernatetask;

import com.softserve.edu.hibernatetask.entity.Employee;
import com.softserve.edu.hibernatetask.entity.Excursion;
import com.softserve.edu.hibernatetask.entity.Exhibit;
import com.softserve.edu.hibernatetask.entity.Hall;
import com.softserve.edu.hibernatetask.service.EmployeeService;
import com.softserve.edu.hibernatetask.service.ExcursionService;
import com.softserve.edu.hibernatetask.service.ExhibitService;
import com.softserve.edu.hibernatetask.service.HallService;
import com.softserve.edu.hibernatetask.service.impl.MuseumEmployeeService;
import com.softserve.edu.hibernatetask.service.impl.MuseumExcursionService;
import com.softserve.edu.hibernatetask.service.impl.MuseumExhibitService;
import com.softserve.edu.hibernatetask.service.impl.MuseumHallService;
import com.softserve.edu.hibernatetask.utils.Configurator;
import com.softserve.edu.hibernatetask.utils.DateHandler;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        try {
            Employee first = new Employee("Dmytro", BigDecimal.valueOf(1000000.0), "Chief");
            Excursion ex = new Excursion("Lviv", "Mon Tue Fri", "3 days", first);
            ExcursionService excursionService = new MuseumExcursionService();
            excursionService.insert(ex);
            excursionService.showAll();
            EmployeeService employeeService = new MuseumEmployeeService();
            employeeService.update(first);
            System.out.println(first.getExcursions());
        } finally {
            Configurator.closeSession();
        }
    }

    private static void mainTest() {
        Employee first = new Employee("Dmytro", BigDecimal.valueOf(1000000.0), "Chief");
        Employee second = new Employee("Yurii", BigDecimal.valueOf(100000.0), "Tech Lead");
        Employee third = new Employee("Bohdan", BigDecimal.valueOf(10000.0), "Senior Engineer");
        EmployeeService employeeService = new MuseumEmployeeService();
        employeeService.insert(first);
        employeeService.insert(second);
        employeeService.insert(third);
        Hall hall = new Hall("Main hall", new HashSet<>(Arrays.asList(first, second, third)));
        HallService hallService = new MuseumHallService();
        hallService.insert(hall);
        hallService.showAll();
        Excursion ex = new Excursion("Lviv", "Mon Tue Fri", "3 days", first);
        ExcursionService excursionService = new MuseumExcursionService();
        excursionService.insert(ex);
        excursionService.showAll();
        Exhibit exhibit = new Exhibit("Mona Lisa", DateHandler.parseDate("28.04.2015"), "Painting",
                "Leonardo da Vinci", "Surrealism", hall);
        ExhibitService exhibitService = new MuseumExhibitService();
        exhibitService.insert(exhibit);
        exhibitService.showAll();
        employeeService.showAll();
    }
}
