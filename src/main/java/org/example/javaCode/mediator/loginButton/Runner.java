package org.example.javaCode.mediator.loginButton;

public class Runner {
    public static void main(String[] args) {
        DataBase.addUserToDB("John","123");
        DataBase.addUserToDB("Bill","111");

        Mediator dialog = new Dialog();
        LoginButton loginButton = new LoginButton();

        loginButton.setMediator(dialog);



    }
}
