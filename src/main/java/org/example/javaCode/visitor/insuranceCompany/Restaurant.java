package org.example.javaCode.visitor.insuranceCompany;

public class Restaurant extends Client{
    public Restaurant(String name, String address, String number) {
        super(name, address, number);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitRestaurant(this);
    }
}
