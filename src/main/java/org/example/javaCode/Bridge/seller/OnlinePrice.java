package org.example.javaCode.Bridge.seller;

public class OnlinePrice implements PriceType {
    @Override
    public void displayProductPrice(String product, double cost) {
        System.out.println("Online price of " + product + " is: " + cost);
    }
}
