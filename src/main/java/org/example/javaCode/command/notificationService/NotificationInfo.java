package org.example.javaCode.command.notificationService;

public class NotificationInfo {
    private long id;
    private long userId;
    private String message;
    private NotificationType type;

    public void setId(long id) {
        this.id = id;
    }

    public void setUserId(long id) {
        this.userId = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setNotificationType(NotificationType type) {
        this.type = type;
    }

    public long getId() {
        return id;
    }
    public long getUserId() {
        return userId;
    }
    public String getMessage() {
        return message;
    }
    public NotificationType getNotificationType() {
        return type;
    }
}
