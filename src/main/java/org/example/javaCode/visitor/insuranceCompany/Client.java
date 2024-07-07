package org.example.javaCode.visitor.insuranceCompany;

public abstract class Client {
    private final String name;
    private final String address;
    private final String number;

    public Client(String name, String address, String number) {
        this.address = address;
        this.name = name;
        this.number = number;
    }

    public abstract void accept(Visitor visitor);

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }
}

