package org.example.javaCode.interpreter.calculator;

public class Minus implements Expression{
    Expression expressionLeft;
    Expression expressionRight;

    public Minus(Expression expressionLeft, Expression expressionRight) {
        this.expressionLeft = expressionLeft;
        this.expressionRight = expressionRight;
    }
    @Override
    public int interpret(Expression context) {
        return expressionLeft.interpret(context) - expressionRight.interpret(context);
    }
}
