package org.example.javaCode.observer.store;

public class MobileAppListener implements EventListener{
    private final String username;

    public MobileAppListener(String username) {
        this.username = username;
    }
    @Override
    public void update(Event eventType) {
        switch(eventType) {
            case SALE -> System.out.println("Dear: " + username + " New sale is coming soon.");
            case NEW_ITEM -> System.out.println("Dear: " + username + "New items is added.");
        }
    }
}
