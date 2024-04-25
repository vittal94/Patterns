package org.example.javaCode.Bridge.seller;

public class Seller {
    public static void sell() {
        ElectronicItem TV = new TV(new OnlinePrice());
        TV.showPriceDetail();

        ElectronicItem DVD = new DVD(new ShowRoomPrice());
        DVD.showPriceDetail();
    }
}
