package org.example.javaCode.FactoryMethod.Developer;

import org.example.javaCode.FactoryMethod.Developer.Developer;
import org.example.javaCode.FactoryMethod.Developer.DeveloperFactory;
import org.example.javaCode.FactoryMethod.Developer.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
