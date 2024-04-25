package org.example.javaCode.Composite.amazonDelivery;

public class DeliveryService {
    private Box box;

    public void setupOrder(Box... boxes) {
        this.box = new CompositeBox(boxes);
    }

    public double calculateOrderPrice() {
        return box.calculatePrice();
    }
}
