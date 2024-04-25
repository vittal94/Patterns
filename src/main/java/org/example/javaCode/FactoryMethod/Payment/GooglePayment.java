package org.example.javaCode.FactoryMethod.Payment;

import java.math.BigDecimal;
import java.text.MessageFormat;

public class GooglePayment implements Payment{
    @Override
    public void pay(BigDecimal amount) {
        System.out.println(
                MessageFormat.format("Successfully paid ${0} to merchant using GooglePay", amount
                ));
    }
}
