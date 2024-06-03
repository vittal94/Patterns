package org.example.javaCode.interpreter.calculator;

public class Plus implements Expression{
    Expression expressionLeft;
    Expression expressionRight;

    public Plus(Expression expressionLeft,Expression expressionRight) {
        this.expressionLeft  = expressionLeft;
        this.expressionRight = expressionRight;
    }
    @Override
    public int interpret(Expression context) {
        return expressionRight.interpret(context) + expressionLeft.interpret(context);
    }
}
