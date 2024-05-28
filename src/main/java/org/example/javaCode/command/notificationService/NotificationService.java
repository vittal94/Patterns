package org.example.javaCode.command.notificationService;

import org.example.javaCode.command.notificationService.notification.Notification;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NotificationService {

    //This code without using of Command pattern
//    public void send(NotificationInfo info) {
//        if(info.getNotificationType().equals(NotificationType.EMAIL)) {
//            System.out.println("Sending by email " + info.getMessage());
//        }else if(info.getNotificationType().equals(NotificationType.SMS)) {
//            System.out.println("Sending by SMS " + info.getMessage());
//        }else if(info.getNotificationType().equals(NotificationType.TELEGRAM)) {
//            System.out.println("Sending by TELEGRAM " + info.getMessage());
//        }
//    }

    private final Map<NotificationType, Notification> notificationMap;

    public NotificationService(List<Notification> list) {
        this.notificationMap = list.stream().collect(Collectors.toMap(Notification::getType, Function.identity()));
    }

    public void send(NotificationInfo info) {
       Notification notification = notificationMap.get(info.getNotificationType());
       notification.send(info);
    }
}
