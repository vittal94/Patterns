package org.example.javaCode.visitor.multipleElementDemostration;

public interface Visitor {
    void visitTheElement(SeniorEmployee employee);
    void visitTheElement(JuniorEmployee employee);
    void visitTheElement(Employee employee);
}
