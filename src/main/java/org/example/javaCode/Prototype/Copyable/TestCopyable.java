package org.example.javaCode.Prototype.Copyable;

public class TestCopyable {
    public static void run() {
        var person = new Person(45,"sarah","conor");
        System.out.println(person);

        var factory = new ProjectFactory(person);
        var copyPerson = factory.cloneProject();
        System.out.println(copyPerson);
    }
}
