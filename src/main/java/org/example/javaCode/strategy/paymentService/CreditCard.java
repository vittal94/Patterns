package org.example.javaCode.strategy.paymentService;

public class CreditCard {
    private int amount = 1000;
    private final String number;
    private final String date;
    private final String cvv;

    public CreditCard(String number, String date, String cvv) {
        this.cvv = cvv;
        this.date = date;
        this.number = number;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getNumber() {
        return number;
    }

    public String getDate() {
        return date;
    }

    public String getCvv() {
        return cvv;
    }
}
