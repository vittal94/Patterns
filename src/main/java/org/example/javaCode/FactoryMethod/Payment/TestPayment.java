package org.example.javaCode.FactoryMethod.Payment;

import java.math.BigDecimal;

public class TestPayment {
    public static void run() throws RuntimeException {
        try {
            Payment payment = PaymentFactory.create(PaymentMethod.PAYPAL);
            payment.pay(new BigDecimal("45655.00"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
