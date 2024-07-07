package org.example.javaCode.visitor.ProjectElement;

public class SeniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewriting junior class...");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("Fixing database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Writing reliable tests...");
    }
}
