package org.example.javaCode.flyweight.developer;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void run(){
        DevFactory devFactory = new DevFactory();

        List<Developer> developers  = new ArrayList<>();

        developers.add(devFactory.getDeveloperBySpecialty("java"));
        developers.add(devFactory.getDeveloperBySpecialty("java"));
        developers.add(devFactory.getDeveloperBySpecialty("java"));
        developers.add(devFactory.getDeveloperBySpecialty("java"));
        developers.add(devFactory.getDeveloperBySpecialty("java"));
        developers.add(devFactory.getDeveloperBySpecialty("java"));
        developers.add(devFactory.getDeveloperBySpecialty("c++"));
        developers.add(devFactory.getDeveloperBySpecialty("c++"));
        developers.add(devFactory.getDeveloperBySpecialty("c++"));
        developers.add(devFactory.getDeveloperBySpecialty("c++"));
        developers.add(devFactory.getDeveloperBySpecialty("c++"));
        developers.add(devFactory.getDeveloperBySpecialty("c++"));

        for (var dev : developers) dev.writeCode();
    }
}
