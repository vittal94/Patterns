package org.example.javaCode.facade.sprintRunner.cryptoCurrency;

public class DataBaseService {
    public User getUser(String userId) {
        return new User(userId);
    }
}
