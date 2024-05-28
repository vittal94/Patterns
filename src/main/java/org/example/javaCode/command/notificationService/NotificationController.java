package org.example.javaCode.command.notificationService;

public class NotificationController {
    private final NotificationService service;

    public  NotificationController(NotificationService service) {
        this.service = service;
    }

    public void sendNotification(NotificationInfo info) {
        service.send(info);

    }
}
