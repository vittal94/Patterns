package org.example.javaCode.visitor.singleElementDemostration;

public class IntegerProcessor implements NumberProcessor{
    private final int number;

    public IntegerProcessor() {
        number = 5;
    }

    public int getNumber() {
        return number;
    }
    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitNumber(this);
    }
}
