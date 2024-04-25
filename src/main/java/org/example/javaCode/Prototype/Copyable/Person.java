package org.example.javaCode.Prototype.Copyable;

public class Person implements Copyable{
    private int age;
    private String name;
    private String secondName;
    public Person(int age, String name, String secondName) {
        this.age = age;
        this.name = name;
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }

    @Override
    public Object copy() {
        return new Person(age,name,secondName);
    }
}
