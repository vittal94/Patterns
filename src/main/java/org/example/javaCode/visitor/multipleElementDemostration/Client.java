package org.example.javaCode.visitor.multipleElementDemostration;

import java.security.spec.ECPoint;
import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        System.out.println("Composite pattern and visitor pattern demonstration.");

        Employee hodMath = fromMathDept();
        Employee hodCompSc = fromComputerScDept();
        Employee principal = fromPrincipal(hodMath, hodCompSc);
        printCollegeStructure(principal);

        List<Employee> participants = createContainer(principal,hodCompSc,hodMath);
        checkPromotionEligibility(participants);
    }

    private static void printCollegeStructure(Employee principal) {
        //Printing the leaf-nodes and branches

        System.out.println("The details of the principal object:");
        //Print complete college structure
        principal.printStructure();
    }

    private static Employee fromComputerScDept() {
        //Three lectures other than HOD works
        //in the computer Science department

        Employee csTeacher1 = new JuniorEmployee("C.Kate","Lecturer", 8.2);
        Employee csTeacher2 = new JuniorEmployee("C.Jones", "Lecturer", 4.5);
        Employee csTeacher3 = new JuniorEmployee("C.Proctor","Lecturer",6);
        Employee hodCompSc = new SeniorEmployee("Mr. V.Sarcar", "HOD.(CSE)", 15.5);

        //Teachers of computer science directly reports to HOD-SCE
        hodCompSc.addEmployee(csTeacher1);
        hodCompSc.addEmployee(csTeacher2);
        hodCompSc.addEmployee(csTeacher3);

        return hodCompSc;
    }

    private static Employee fromMathDept() {
        Employee mathTeacher1 = new JuniorEmployee("M.Jacob","Lecturer", 7.4);
        Employee mathTeacher2 = new JuniorEmployee("M.Rustom","Lecturer",3);
        Employee hodMath = new SeniorEmployee("Mrs.S.Das", "HOD(Math)",12.5);

        //Teacher of mathematics directly reports to HOD-mathematics
        hodMath.addEmployee(mathTeacher1);
        hodMath.addEmployee(mathTeacher2);

        return hodMath;
    }

    private static Employee fromPrincipal(Employee hodMath, Employee hodCompSc) {
        Employee principal = new SeniorEmployee("Dr.S.Som","Principal",21);

        //Principal is on top of the college
        //The HOD(Mathematics) and HOD(Computer Sc.) directly report to him
        principal.addEmployee(hodMath);
        principal.addEmployee(hodCompSc);

        return principal;
    }

    private static List<Employee> createContainer(Employee principal, Employee hodMath, Employee hodCompSc) {

        //For employee who directly reports to Principal
        List<Employee> employeeContainer = new ArrayList<>(principal.subordinates);

        //For employees who directly reports to HOD(Math)
        employeeContainer.addAll(hodMath.subordinates);

        //For employee who directly reports to HOD(Comp.Sc)
        employeeContainer.addAll(hodCompSc.subordinates);

        return employeeContainer;
    }

    private static void checkPromotionEligibility(List<Employee> container) {
        Visitor visitor  = new PromotionCheckerVisitor();

        //Principal holds the highest position.
        //He does not need a promotion

        System.out.println("\nChecking the eligible candidates for promotion.");
        for(Employee emp : container)
            emp.acceptVisitor(visitor);
    }
}
