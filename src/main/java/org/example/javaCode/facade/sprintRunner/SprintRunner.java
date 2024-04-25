package org.example.javaCode.facade.sprintRunner;

public class SprintRunner {
    public static void run() {
        Job job = new Job();
        job.doJob();
        Developer developer = new Developer();
        BugTracker bugTracker = new BugTracker();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
        bugTracker.finishSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }

    public static void usingFacade() {
        Workflow workflow = new Workflow();
        workflow.solveProblems();
    }
}
