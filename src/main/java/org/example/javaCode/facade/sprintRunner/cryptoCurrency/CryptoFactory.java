package org.example.javaCode.facade.sprintRunner.cryptoCurrency;

public class CryptoFactory {
    public static CryptoService getCryptoService(String currency) {
        if(currency.equals("BTC"))
            return new BitcoinService();
        else if (currency.equals("ETH")) {
            return new EthereumService();
        } else throw new IllegalArgumentException();
    }
}
