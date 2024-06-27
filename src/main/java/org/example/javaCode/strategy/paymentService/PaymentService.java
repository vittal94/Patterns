package org.example.javaCode.strategy.paymentService;

public class PaymentService {
    private int cost;
    private boolean includeDelivery;

    private PaymentStrategy paymentStrategy;

    public void processOrder() {
        paymentStrategy.collectPaymentDetails();
        if(paymentStrategy.validatePaymentDetails())
            paymentStrategy.pay(getTotal());
    }

    public void setPayment(PaymentStrategy payment) {
        paymentStrategy = payment;
    }

    private int getTotal() {
        return includeDelivery ? cost + 10 : cost;
    }
}
