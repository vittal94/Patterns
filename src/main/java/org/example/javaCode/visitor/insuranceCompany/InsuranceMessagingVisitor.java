package org.example.javaCode.visitor.insuranceCompany;

import java.util.List;

public class InsuranceMessagingVisitor implements Visitor{

    public void sendInsuranceMails(List<Client> clients) {
        for(var client : clients) {
            client.accept(this);
        }
    }
    @Override
    public void visitBank(Bank bank) {
        System.out.println("Sending mail about theft insurance...");
    }

    @Override
    public void visitRestaurant(Restaurant restaurant) {
        System.out.println("Sending mail about fire and food insurance...");
    }

    @Override
    public void visitResident(Resident resident) {
        System.out.println("Sending mail about medical insurance...");
    }
}
