package org.example.javaCode.facade.sprintRunner;

public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker) {
        if(bugTracker.isActive())
            System.out.println("Developer doing its job");
        else
            System.out.println("Developer is reading habre");
    }
}
