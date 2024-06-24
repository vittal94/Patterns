package org.example.javaCode.observer.store;

public class Store {
    private final NotificationService notificationService;

    public Store(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void newItemPromotion() {
        notificationService.notifyListeners(Event.NEW_ITEM);
    }

    public void newSalePromotion() {
        notificationService.notifyListeners(Event.SALE);
    }

    public NotificationService getService() {
        return notificationService;
    }
}
