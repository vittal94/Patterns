package org.example.javaCode.decorator.javaDev;

public class DeveloperDecorator implements Developer {
    protected final Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }
    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
