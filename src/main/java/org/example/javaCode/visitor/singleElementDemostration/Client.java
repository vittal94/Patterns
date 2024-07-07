package org.example.javaCode.visitor.singleElementDemostration;

public class Client {
    public static void main(String[] args) {
        NumberProcessor integer = new IntegerProcessor();

        Visitor increment = new IncrementorVisitor();
        Visitor multiply = new DoubleMakerVisitor();

        integer.acceptVisitor(increment);

        System.out.println("\n==============\n");

        integer.acceptVisitor(multiply);
    }
}
