package org.example.javaCode.visitor.multipleElementDemostration;

public class JuniorEmployee extends Employee{

    public JuniorEmployee(String name, String designation, double experience) {
        super(name, designation, experience);
    }

    @Override
    protected void printStructure() {
        System.out.println("\t\t" + this.name + " is a " + this.designation + ". Experience: " + this.experience);

    }

    @Override
    protected int getSubordinatesCount() {
        return subordinatesCount;  // always 0
    }

    @Override
    protected void addEmployee(Employee employee) {
         //Empty method
    }

    @Override
    protected void removeEmployee(Employee employee) {
         //Empty method
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
            visitor.visitTheElement(this);
    }
}
