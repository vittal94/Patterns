package org.example.javaCode.Bridge.seller;

public class DVD extends ElectronicItem {
    private final String product;
    private double cost;

    protected DVD(PriceType priceType) {
        super(priceType);
        product = "DVD";
        cost = 200.0;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    @Override
    public void showPriceDetail() {
        priceType.displayProductPrice(product,cost);
    }
}
