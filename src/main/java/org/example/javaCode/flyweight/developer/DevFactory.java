package org.example.javaCode.flyweight.developer;

import java.util.HashMap;
import java.util.Map;

public class DevFactory {
    private static final Map<String,Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpecialty(String specialty) {
        Developer developer = developers.get(specialty);
        if (developer == null) {
            switch (specialty) {
                case "java" -> {
                    System.out.println("Hiring Java developer...");
                    developer = new JavaDev();
                }
                case "c++" -> {
                    System.out.println("Hiring cpp developer...");
                    developer = new CppDev();
                }
            }
        }
        developers.put(specialty,developer);
        return developer;
    }
}
