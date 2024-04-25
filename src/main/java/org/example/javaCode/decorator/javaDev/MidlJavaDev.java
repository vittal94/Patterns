package org.example.javaCode.decorator.javaDev;

public class MidlJavaDev extends DeveloperDecorator {

    public MidlJavaDev(Developer javaDev) {
        super(javaDev);
    }

    public String makeCoeReviews() {
        return "Make code review.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + " and " + makeCoeReviews();
    }
}
