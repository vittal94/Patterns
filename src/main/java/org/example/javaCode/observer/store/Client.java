package org.example.javaCode.observer.store;

public class Client {
    public static void main(String[] args) {
        var notificationService = new NotificationService();

        notificationService.subscribe(Event.SALE, new MobileAppListener("John"));
        notificationService.subscribe(Event.NEW_ITEM, new MobileAppListener("Jack"));
        notificationService.subscribe(Event.NEW_ITEM, new EmailMsgListener("@Jack.com"));
        notificationService.subscribe(Event.SALE, new EmailMsgListener("@Jackson.com"));

        var store = new Store(notificationService);

        store.newItemPromotion();
        store.newSalePromotion();
    }
}
