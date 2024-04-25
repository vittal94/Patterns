package org.example.javaCode.FactoryMethod.Developer;

import org.example.javaCode.FactoryMethod.Developer.Developer;
import org.example.javaCode.FactoryMethod.Developer.DeveloperFactory;
import org.example.javaCode.FactoryMethod.Developer.KotlinDeveloper;

public class KotlinDeveloperFactory implements DeveloperFactory
{
    @Override
    public Developer createDeveloper() {
        return new KotlinDeveloper();
    }
}
