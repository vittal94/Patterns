package org.example.javaCode.strategy.developerActivity;

public class DeveloperRunner {
    public static void main(String[] args) {
        var developer = new Developer();
        developer.executeActivity();
        developer.setActivity(new Coding());
        developer.executeActivity();
        developer.setActivity(new Reading());
        developer.executeActivity();
        developer.setActivity(new Training());
        developer.executeActivity();
    }
}
