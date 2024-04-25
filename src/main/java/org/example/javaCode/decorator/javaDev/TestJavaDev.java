package org.example.javaCode.decorator.javaDev;

public class TestJavaDev {
    public static void run() {
        Developer javaDev = new JavaDeveloper();
        Developer midlJavaDev = new MidlJavaDev(javaDev);
        Developer seniorJavaDev = new SeniorJavaDev((MidlJavaDev) midlJavaDev);

        System.out.println(javaDev.makeJob());
        System.out.println(midlJavaDev.makeJob());
        System.out.println(seniorJavaDev.makeJob());
    }
}

