package org.example.javaCode.visitor.multipleElementDemostration;

public class SeniorEmployee extends Employee{
    public SeniorEmployee(String name, String designation, double experience) {
        super(name,designation,experience);
    }
    @Override
    protected void printStructure() {
        System.out.println("\t" + this.name + " is a " + this.designation + ". Experience: " +
                this.experience);

        for(Employee employee : subordinates) {
            employee.printStructure();
        }
    }

    @Override
    protected int getSubordinatesCount() {
        subordinatesCount  = subordinates.size();
        for(Employee employee : subordinates) {
            subordinatesCount += employee.getSubordinatesCount();
        }
        return subordinatesCount;
    }

    @Override
    protected void addEmployee(Employee employee) {
subordinates.add(employee);
    }

    @Override
    protected void removeEmployee(Employee employee) {
subordinates.remove(employee);
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
       visitor.visitTheElement(this);
    }
}
