package org.example.javaCode.strategy.paymentService;

public class RunService {
    public static void main(String[] args) {
        var service = new PaymentService();
        service.setPayment(new PaymentByCreditCard());
        service.processOrder();

        service.setPayment(new PaymentByPayPal());
        service.processOrder();
    }
}
