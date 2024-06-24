package org.example.javaCode.observer.store;

public class EmailMsgListener implements EventListener {
    private String email;
    public EmailMsgListener(String email) {
        this.email = email;
    }
    @Override
    public void update(Event eventType) {
       switch (eventType) {
           case SALE -> System.out.println("Dear: " + email + " New sale is coming soon.");
           case NEW_ITEM -> System.out.println("Dear: " + email + " New items is added.");
       }
    }
}
