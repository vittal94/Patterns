package org.example.javaCode.strategy.paymentService;

public class PaymentByCreditCard implements PaymentStrategy{
    private CreditCard card;
    public void setCard(CreditCard card) {
        this.card = card;
    }

    @Override
    public void collectPaymentDetails() {
        card = new CreditCard("1233", "23.45.44","234");
    }

    @Override
    public boolean validatePaymentDetails() {
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using credit card");
        card.setAmount(card.getAmount() - amount);
    }
}
