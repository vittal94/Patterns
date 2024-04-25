package org.example.javaCode.Prototype.Copyable;

public class ProjectFactory {
    private final Person person;

    public ProjectFactory(Person person) {
        this.person = person;
    }
    public Person cloneProject(){
        return (Person) person.copy();
    }
}
