package org.example.javaCode.decorator.javaDev;

public class SeniorJavaDev extends DeveloperDecorator {
    public SeniorJavaDev(MidlJavaDev midlJavaDev) {
        super(midlJavaDev);
    }

    public String makeTechnicalSpec() {
        return "Make technical specification...";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + " and " + makeTechnicalSpec();
    }
}
