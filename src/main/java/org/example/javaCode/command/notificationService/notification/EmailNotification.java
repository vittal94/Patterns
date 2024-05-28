package org.example.javaCode.command.notificationService.notification;

import org.example.javaCode.command.notificationService.NotificationInfo;
import org.example.javaCode.command.notificationService.NotificationType;

public class EmailNotification implements Notification{
    @Override
    public void send(NotificationInfo info) {
        System.out.println("Sending by email " + info.getMessage());
    }

    @Override
    public NotificationType getType() {
        return NotificationType.EMAIL;
    }
}
