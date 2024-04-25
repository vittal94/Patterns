package org.example.javaCode.facade.sprintRunner.cryptoCurrency;

public record User(
        String id,
        String name,
        double balance,
        String currency,
        String accountNbr
) {
    public User(String id) {
        this(id,"John",0.0,"BTC","0");
    }
}
