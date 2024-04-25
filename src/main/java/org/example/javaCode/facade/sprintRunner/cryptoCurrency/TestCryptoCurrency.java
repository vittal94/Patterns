package org.example.javaCode.facade.sprintRunner.cryptoCurrency;

public class TestCryptoCurrency {
    public static void run() {
        BuyCryptoFacade buyCryptoFacade = new BuyCryptoFacade();
        buyCryptoFacade.buyCryptoCurrency(45,"BTC");
    }
}
