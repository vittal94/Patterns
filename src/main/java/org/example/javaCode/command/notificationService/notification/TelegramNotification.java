package org.example.javaCode.command.notificationService.notification;

import org.example.javaCode.command.notificationService.NotificationInfo;
import org.example.javaCode.command.notificationService.NotificationType;

public class TelegramNotification implements Notification{
    @Override
    public void send(NotificationInfo info) {
        System.out.println("Sending by telegram " + info.getMessage());
    }

    @Override
    public NotificationType getType() {
        return NotificationType.TELEGRAM;
    }
}
