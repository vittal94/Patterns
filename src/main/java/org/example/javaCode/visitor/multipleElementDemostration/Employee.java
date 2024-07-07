package org.example.javaCode.visitor.multipleElementDemostration;



import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
    protected String name;
    protected String designation;
    protected int subordinatesCount;
    protected List<Employee> subordinates;
    protected final double experience;

    public Employee(String name, String designation, double experience) {
        this.name = name;
        this.designation = designation;
        this.experience = experience;
        subordinates = new ArrayList<>();
    }

    protected abstract void printStructure();

    protected abstract int getSubordinatesCount();

    protected abstract void addEmployee(Employee employee);

    protected abstract void removeEmployee(Employee employee);

    public double getExperience() {
        return experience;
    }

    public String getName() {
        return name;
    }

    public abstract void acceptVisitor(Visitor visitor);
}
