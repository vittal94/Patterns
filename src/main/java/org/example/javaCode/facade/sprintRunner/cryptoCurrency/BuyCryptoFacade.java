package org.example.javaCode.facade.sprintRunner.cryptoCurrency;

public class BuyCryptoFacade {
    public void buyCryptoCurrency(double amount,String currency) {
        DataBaseService dataBaseService = new DataBaseService();
        User user =  dataBaseService.getUser("John");
        if (user.balance() < amount) {
            System.out.println("Insufficient balance to perform transaction");
            return;
        }
        CryptoFactory.getCryptoService(currency).buyCurrency(user,amount);
    }
}
