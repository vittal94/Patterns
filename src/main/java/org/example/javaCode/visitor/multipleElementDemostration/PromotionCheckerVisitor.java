package org.example.javaCode.visitor.multipleElementDemostration;

public class PromotionCheckerVisitor implements Visitor{
    @Override
    public void visitTheElement(SeniorEmployee employee) {
        //We promote them if experience is greater than 15 years
        boolean eligibleForPromotion = employee.getExperience() > 15;
        System.out.println("\t\t" + employee.getName() + " is eligible for promotion? " + eligibleForPromotion);
    }

    @Override
    public void visitTheElement(JuniorEmployee employee) {
        // We'll promote them if experience is greater than 5 years
        boolean eligibleForPromotion = employee.getExperience() > 5;
        System.out.println("\t\t" + employee.getName() + " is eligible for promotion? " + eligibleForPromotion);
    }

    @Override
    public void visitTheElement(Employee employee) {

    }
}
