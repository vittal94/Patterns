package org.example.javaCode.Bridge.programmCreator;

public class ProgrammeCreator {
    public static void makeProgramme() {
        Program[] programs = {
                new BankSystem(new JavaDev()),
                new StockExchange(new CppDev())
        };

        for(Program p : programs) {
            p.developProgram();
        }
    }
}
