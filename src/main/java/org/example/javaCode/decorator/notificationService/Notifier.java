package org.example.javaCode.decorator.notificationService;

public class Notifier implements INotifier {
    private final String userName;
    private final DataBaseService dataBaseService;

    public Notifier(String userName) {
        this.userName = userName;
        dataBaseService = new DataBaseService();
    }
    @Override
    public void send(String msg) {
        String mail = dataBaseService.getMailFromUsername(userName);
        System.out.println("Sending " + msg + " by mail to " + mail);
    }

    @Override
    public String getUserName() {
        return userName;
    }
}
