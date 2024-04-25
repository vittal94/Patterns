package org.example.javaCode.Singelton.BestPractice;

public enum Singelton {
    INSTANCE;
    private String file  = "str";
    public void write(String msg) {
        file += msg;
    }
    public String read() {
        return file;
    }
}
