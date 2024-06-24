package org.example.javaCode.observer.jobSearch;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java position");
        jobSite.addVacancy("Second Java position");

        Observer firstObserver = new Subscriber("Vittal");
        Observer secondObserver = new Subscriber("Paul Mccartney");

        jobSite.addObserver(firstObserver);
        jobSite.addObserver(secondObserver);

        jobSite.addVacancy("Third Java position");

        jobSite.removeVacancy("First Java position");
    }
}
