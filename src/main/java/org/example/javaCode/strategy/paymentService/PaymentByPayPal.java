package org.example.javaCode.strategy.paymentService;

public class PaymentByPayPal implements PaymentStrategy{
    private String email;
    private String password;
    @Override
    public void collectPaymentDetails() {
        email = "...";
        password = "...";
    }

    @Override
    public boolean validatePaymentDetails() {
        return false;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using PayPal");
    }
}
