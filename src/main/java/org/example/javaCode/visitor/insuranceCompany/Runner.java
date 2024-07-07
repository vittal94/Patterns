package org.example.javaCode.visitor.insuranceCompany;

import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Client> clients = List.of(
                new Bank("Bel","Baranovich", "1"),
                new Restaurant("Crocus","Linina", "34"),
                new Resident("John","LA","12")
        );

        InsuranceMessagingVisitor visitor = new InsuranceMessagingVisitor();
        visitor.sendInsuranceMails(clients);
    }
}
