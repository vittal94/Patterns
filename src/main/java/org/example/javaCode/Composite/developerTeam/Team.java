package org.example.javaCode.Composite.developerTeam;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private final List<Developer> developers = new ArrayList<>();
    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void createProject(){
        System.out.println("Team creating the project...\n");
        for (var developer : developers)
            developer.writeCode();
    }
}
