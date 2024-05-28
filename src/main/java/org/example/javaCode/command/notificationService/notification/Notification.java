package org.example.javaCode.command.notificationService.notification;

import org.example.javaCode.command.notificationService.NotificationInfo;
import org.example.javaCode.command.notificationService.NotificationType;

public interface Notification {
    void send(NotificationInfo info);
    NotificationType getType();
}
