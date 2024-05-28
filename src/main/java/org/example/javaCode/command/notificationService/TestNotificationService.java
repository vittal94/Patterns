package org.example.javaCode.command.notificationService;

import org.example.javaCode.command.notificationService.notification.EmailNotification;
import org.example.javaCode.command.notificationService.notification.Notification;
import org.example.javaCode.command.notificationService.notification.SmsNotification;
import org.example.javaCode.command.notificationService.notification.TelegramNotification;

import java.util.ArrayList;
import java.util.List;

public class TestNotificationService {
    public static void run() {
        List<Notification> notifications = List.of(
                new EmailNotification(),
                new SmsNotification(),
                new TelegramNotification()
        );
        NotificationService service = new NotificationService(notifications);
        NotificationController controller = new NotificationController(service);

        NotificationInfo telegramNotification = new NotificationInfo();
        telegramNotification.setNotificationType(NotificationType.TELEGRAM);
        telegramNotification.setId(789);
        telegramNotification.setUserId(987);
        telegramNotification.setMessage("Hello you fat fuck!!!");

        controller.sendNotification(telegramNotification);
    }
}
