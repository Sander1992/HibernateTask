package com.softserve.edu.hibernatetask.utils;

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

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;

public final class TableFiller {
    public static void fillWithEmployees() {
        Employee first = new Employee("Mykhaylo Savchuk", BigDecimal.valueOf(1000.0), "Guardian");
        Employee second = new Employee("Vasyl Sushko", BigDecimal.valueOf(10000.0), "Artist");
        EmployeeService empService = new MuseumEmployeeService();
        empService.insert(first);
        empService.insert(second);
    }

    public static void fillWithExcursion() {
        Employee resp = new Employee("Peter Responsible", BigDecimal.valueOf(3400.0), "Guide");
        EmployeeService empService = new MuseumEmployeeService();
        empService.insert(resp);
        Excursion first = new Excursion("Dino excursion", "Mon, Thu", "1 week", resp);
        Excursion second = new Excursion("Pterodactyl excursion", "Wed, Fri", "2 week", resp);
        ExcursionService exService = new MuseumExcursionService();
        exService.insert(first);
        exService.insert(second);
    }

    public static void fillWithExhibits() {
        Employee first = new Employee("Peter Jackson", BigDecimal.valueOf(1400.0), "Painter");
        Employee second = new Employee("Brad Pitt", BigDecimal.valueOf(13400.0), "Actor");
        EmployeeService empService = new MuseumEmployeeService();
        empService.insert(first);
        empService.insert(second);
        Hall hall = new Hall("Main hall", new HashSet<>(Arrays.asList(first, second)));
        HallService hallService = new MuseumHallService();
        hallService.insert(hall);
        Exhibit monaLisa = new Exhibit("Mona Lisa", DateHandler.parseDate("28.04.2015"), "Painting",
                "Leonardo da Vinci", "Surrealism", hall);
        Exhibit dino = new Exhibit("Dino", DateHandler.parseDate("18.03.2016"), "Bounds",
                "Nature", null, hall);
        ExhibitService exhibitService = new MuseumExhibitService();
        exhibitService.insert(monaLisa);
        exhibitService.insert(dino);
    }

    public static void fillWithHalls() {
        Employee first = new Employee("Kvych Yurii", BigDecimal.valueOf(1560.0), "Guardian");
        Employee second = new Employee("Lukashchuk Bohdan", BigDecimal.valueOf(10233.0), "Architect");
        Employee third = new Employee("Kononchuk Bohdan", BigDecimal.valueOf(2133.0), "Sculptor");
        EmployeeService empService = new MuseumEmployeeService();
        empService.insert(first);
        empService.insert(second);
        empService.insert(third);
        Hall secondHall = new Hall("Second hall", new HashSet<>(Arrays.asList(first, second)));
        Hall goldHall = new Hall("Gold hall", new HashSet<>(Arrays.asList(second, third)));
        HallService hallService = new MuseumHallService();
        hallService.insert(secondHall);
        hallService.insert(goldHall);
    }
}
