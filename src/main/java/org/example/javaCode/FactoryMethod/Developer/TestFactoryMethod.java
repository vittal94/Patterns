package org.example.javaCode.FactoryMethod.Developer;

import org.example.javaCode.FactoryMethod.Developer.Developer;
import org.example.javaCode.FactoryMethod.Developer.DeveloperFactory;
import org.example.javaCode.FactoryMethod.Developer.JavaDeveloperFactory;
import org.example.javaCode.FactoryMethod.Developer.KotlinDeveloperFactory;

public class TestFactoryMethod {
    public static void run() {
        DeveloperFactory javaFactory = new JavaDeveloperFactory();
        Developer javaDev = javaFactory.createDeveloper();
        javaDev.writeCode();

        DeveloperFactory kotlinFactory = new KotlinDeveloperFactory();
        Developer kotlinDev = kotlinFactory.createDeveloper();
        kotlinDev.writeCode();
    }
}
