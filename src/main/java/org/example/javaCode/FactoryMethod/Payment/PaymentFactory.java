package org.example.javaCode.FactoryMethod.Payment;

import java.text.MessageFormat;

public class PaymentFactory {
    public static Payment create(PaymentMethod paymentMethod) throws ClassNotFoundException {
        switch (paymentMethod) {
            case PAYPAL -> {
                return new PayPalPayment();
            }
            case APPLE_PAY -> {
                return new ApplePayment();
            }
            case GOOGLE_PAY -> {
                return new GooglePayment();
            }
            default -> {
                throw new ClassNotFoundException(
                        MessageFormat.format("{0} is not currently supported",paymentMethod)
                );
            }

        }
    }
}
