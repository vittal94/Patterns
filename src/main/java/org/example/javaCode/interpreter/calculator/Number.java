package org.example.javaCode.interpreter.calculator;

public class Number implements Expression{
    private int number;

    public Number(int number) {
        this.number = number;
    }
    @Override
    public int interpret(Expression context) {
        return number;
    }
}
