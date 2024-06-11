package org.example.javaCode.mediator.loginButton;
import javax.swing.*;

public class Dialog implements Mediator{
    private JTextField userTextBox;
    private JTextField passTextBox;
    private LoginButton button;
    @Override
    public void login() {
       String username =  userTextBox.getText();
       String password = passTextBox.getText();

       DataBase.validateUser(username,password);
    }
}
