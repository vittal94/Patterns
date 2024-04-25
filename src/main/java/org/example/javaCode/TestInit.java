package org.example.javaCode;

public class TestInit {
    private int id;
    public TestInit() {
        id = 0;
        System.out.println("default constructor called");
    }
    public TestInit(int id) {
        
        this.id = id;
        System.out.println("constructor called");
    }
    {
        System.out.println("init block called");
    }
    static {
        System.out.println("static init block called");
    }
    public void print(int t) {

    }
}
