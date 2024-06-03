package org.example.javaCode.interpreter.calculator;

import java.util.Stack;

public class Evaluate implements Expression{
    Expression evaluate;

    public Evaluate(String expression) {
        Stack<Expression> expressions = new Stack<>();
        String expressionRevers = new StringBuilder(expression).reverse().toString();
        for(String s : expressionRevers.split("\\D")) {
            expressions.push(new Number(Integer.parseInt(s)));
        }
        for(String s : expression.split("\\d")) {
            if(s.equals("+")) {
                expressions.push(new Plus(expressions.pop(), expressions.pop()));
            }
            else if(s.equals("-")) {
                expressions.push(new Minus(expressions.pop(), expressions.pop()));
            }
        }
        evaluate  = expressions.pop();
    }
    @Override
    public int interpret(Expression context) {
        return evaluate.interpret(context);
    }
}
