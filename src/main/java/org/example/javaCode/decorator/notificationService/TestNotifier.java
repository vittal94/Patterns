package org.example.javaCode.decorator.notificationService;

public class TestNotifier {
    public static void run() {
        INotifier notifier = new Notifier("Jon");
        notifier.send("Hi");
        INotifier facebookNotify = new FacebookDecorator(notifier);
        facebookNotify.send("Good");
        INotifier allMessage = new WhatsAppDecorator(facebookNotify);
        allMessage.send("to all service");

        sendMsg(
                new FacebookDecorator(
                        new Notifier("Sarah")
                ),"you must die"
        );
    }

    private static void sendMsg(INotifier notifier, String msg) {
        notifier.send(msg);
    }
}
