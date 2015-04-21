package com.softserve.edu.hibernatetask.ui.commands.databasecommands.exhibitcommands;

import com.softserve.edu.hibernatetask.entity.Exhibit;
import com.softserve.edu.hibernatetask.service.ExhibitService;
import com.softserve.edu.hibernatetask.service.impl.MuseumExhibitService;
import com.softserve.edu.hibernatetask.ui.commandcore.Command;
import com.softserve.edu.hibernatetask.utils.PrettyOutput;

import java.util.List;
import java.util.Scanner;

import static com.softserve.edu.hibernatetask.utils.PrettyOutput.displayColumns;


public class FindByNameExhibitCommand implements Command{

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter exhibit name:");
        String str = sc.nextLine();
        ExhibitService exhibitService = new MuseumExhibitService();
        List<Exhibit> exhib = exhibitService.findByName(str);
        PrettyOutput.displayInfo("All exhibits with name " + str);
        PrettyOutput.displayDelimiter();
        PrettyOutput.displayColumns("ID", "Name", "Date", "Author", "Material",  "Hall");
        exhib.forEach(e -> displayColumns(e.getId(), e.getName(),  e.getDate(), e.getAuthor(),
                e.getMaterial(), e.getHall()));
        PrettyOutput.displayDelimiter();
    }

    @Override
    public String getName() {
        return "Find exhibit (by name)";
    }
}

