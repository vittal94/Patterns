package org.example.javaCode.visitor.ProjectElement;

public interface Developer {
    void create(ProjectClass projectClass);
    void create(DataBase dataBase);
    void create(Test test);
}
