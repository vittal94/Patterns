package org.example.javaCode.interpreter.calculator;

public interface Expression {
    int interpret(Expression context);
}
