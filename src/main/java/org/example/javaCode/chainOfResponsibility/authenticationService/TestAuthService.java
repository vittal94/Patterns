package org.example.javaCode.chainOfResponsibility.authenticationService;

public class TestAuthService {
    public static void run() {
        DataBase dataBase = new DataBase();
        Handler handler = new UserExistHandler(dataBase)
                .setNextHandler(new ValidPasswordHandler(dataBase))
                .setNextHandler(new RoleCheckHandler());

        AuthService authService = new AuthService(handler);
        authService.logIn("username", "password");
    }
}
