package org.example.javaCode.Bridge.seller;

public class TV extends ElectronicItem {
    private final String product;
    private double cost;
    protected TV(PriceType priceType) {
        super(priceType);
        product = "TV";
        cost = 540.2;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public void showPriceDetail() {
        priceType.displayProductPrice(product,cost);
    }
}
