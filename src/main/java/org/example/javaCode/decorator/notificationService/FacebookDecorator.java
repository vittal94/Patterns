package org.example.javaCode.decorator.notificationService;

public class FacebookDecorator extends BaseNotifierDecorator {
    FacebookDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        String FBName = dataBaseService.getFBNameFromUsername(getUserName());
        System.out.println("Sending " + msg + " on Facebook to " + FBName);
    }
}
