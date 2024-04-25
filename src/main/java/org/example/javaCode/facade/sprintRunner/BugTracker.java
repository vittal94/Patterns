package org.example.javaCode.facade.sprintRunner;

public class BugTracker {
    private boolean active = false;

    public boolean isActive() {return active;}
    public void startSprint() {
        System.out.println("Starting the sprint");
        active = true;
    }

    public void finishSprint() {
        System.out.println("finishing the sprint");
        active = false;
    }
}
