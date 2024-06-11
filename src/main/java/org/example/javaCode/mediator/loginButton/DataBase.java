package org.example.javaCode.mediator.loginButton;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    public static Map<String, String> users = new HashMap<>();
    public static void addUserToDB(String name, String password) {
        users.put(name,password);
    }
    public static void validateUser(String name, String password) {
        if(users.containsKey(name)) {
            if(users.get(name).equals(password))
                System.out.println("User " + name + " are successfully login");
            else
                System.out.println("Incorrect password to user " + name);
        }
        else
            System.out.println("There is no such user by name " + name);
    }

}
