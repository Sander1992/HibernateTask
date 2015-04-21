package com.softserve.edu.hibernatetask.ui.commands.dataBaseCommands.excursionCommands;

import com.softserve.edu.hibernatetask.entity.Excursion;
import com.softserve.edu.hibernatetask.service.ExcursionService;
import com.softserve.edu.hibernatetask.service.impl.MuseumExcursionService;
import com.softserve.edu.hibernatetask.ui.commandCore.Command;
import com.softserve.edu.hibernatetask.utils.PrettyOutput;

import java.util.List;
import java.util.Scanner;

import static com.softserve.edu.hibernatetask.utils.PrettyOutput.displayColumns;

/**
 * Created by Sander on 20.04.2015.
 */
public class FindByNameExcursionCommand implements Command{
    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter excursion name:");
        String str = sc.nextLine();
        ExcursionService excursionService = new MuseumExcursionService();
        List<Excursion> excur = excursionService.findByName(str);
        PrettyOutput.displayInfo("All excursions with name " + str);
        PrettyOutput.displayColumns("ID", "Name", "Schedule", "Duration");
        excur.forEach(e -> displayColumns(e.getId(), e.getName(),  e.getSchedule(), e.getDuration()));
        PrettyOutput.displayDelimiter();
    }

    @Override
    public String getName() {
        return "Find exursion (by name)";
    }
}
