package org.example.javaCode.Composite.amazonDelivery;

public class TestAmazonDelivery {
    public static void run() {
        DeliveryService deliveryService = new DeliveryService();

        deliveryService.setupOrder(
                new CompositeBox(
                        new VideoGame("Half Life",20.0)
                ),
                new CompositeBox(
                        new CompositeBox(
                                new Book("JavaBook",45.2),
                                new Book("Cpp Book", 5555.1))
                ),
                new VideoGame("GTA SanAndreas",60.8),
                new VideoGame("GTA5", 56)
        );

        System.out.println("Price of the order...");
        System.out.println(deliveryService.calculateOrderPrice());
    }
}
