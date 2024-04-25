package org.example.javaCode.Bridge.seller;

public class ShowRoomPrice implements PriceType {
    @Override
    public void displayProductPrice(String product, double cost) {
        System.out.println("Showroom price of " + product + " is: " + cost);
    }
}
