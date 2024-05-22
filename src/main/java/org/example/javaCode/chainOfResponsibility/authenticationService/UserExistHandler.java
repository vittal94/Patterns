package org.example.javaCode.chainOfResponsibility.authenticationService;

public class UserExistHandler extends Handler{
    private DataBase dataBase;

    public UserExistHandler(DataBase dataBase) {
        this.dataBase = dataBase;
    }
    @Override
    public boolean handle(String username, String password) {
        if(!dataBase.isValidUser(username)) {
            System.out.println("This username is not registered!");
            System.out.println("Signe up to our app now!");
            return false;
        }
        return handleNext(username, password);
    }
}
