package org.example.javaCode.chainOfResponsibility.managerNotifier;

public class SimpleReportNotifier extends Notifier{

    public SimpleReportNotifier(int priority) {
        super(priority);
    }
    @Override
    public void write(String message) {
        System.out.println("Notifying using a simple report: " + message);
    }
}
