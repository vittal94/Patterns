package org.example.javaCode.chainOfResponsibility.authenticationService;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    private final Map<String, String> users;

    public DataBase() {
        users = new HashMap<>();
        users.put("admin_username", "admin_password");
        users.put("user_username", "user_password");
    }

    public boolean isValidUser(String name) {
        return users.containsKey(name);
    }

    public boolean isValidPassword(String username,String password) {
        return users.get(username).equals(password);
    }
}
