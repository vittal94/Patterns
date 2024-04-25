package org.example.javaCode.decorator.notificationService;

public class WhatsAppDecorator extends BaseNotifierDecorator {
    WhatsAppDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        String phoneNbr = dataBaseService.getPhoneNbrFromUsername(getUserName());
        System.out.println("Sending " + msg + " by WhatsApp on" + phoneNbr);
    }
}
