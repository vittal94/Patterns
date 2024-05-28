package org.example.javaCode.command.notificationService.notification;

import org.example.javaCode.command.notificationService.NotificationInfo;
import org.example.javaCode.command.notificationService.NotificationType;

public class SmsNotification implements Notification{
    @Override
    public void send(NotificationInfo info) {
        System.out.println("Sending by sms " + info.getMessage());
    }

    @Override
    public NotificationType getType() {
        return NotificationType.SMS;
    }
}
