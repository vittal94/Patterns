package org.example.javaCode.Bridge.seller;

public abstract class ElectronicItem {
    protected PriceType priceType;
    protected ElectronicItem(PriceType priceType) {
        this.priceType = priceType;
    }

    public abstract void showPriceDetail();
}
