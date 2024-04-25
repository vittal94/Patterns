package org.example.javaCode.Bridge.programmCreator;

public class StockExchange extends Program{
    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    void developProgram() {
        System.out.println("Stock exchange development on progress...");
        developer.writeCode();
    }
}
