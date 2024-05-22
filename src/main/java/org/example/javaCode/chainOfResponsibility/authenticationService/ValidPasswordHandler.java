package org.example.javaCode.chainOfResponsibility.authenticationService;

public class ValidPasswordHandler extends Handler{
    private DataBase dataBase;

    public ValidPasswordHandler(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public boolean handle(String username, String password) {
        if(!dataBase.isValidPassword(username,password)) {
            System.out.println("Wrong password!");
            return false;
        }
        return handleNext(username, password);
    }
}
