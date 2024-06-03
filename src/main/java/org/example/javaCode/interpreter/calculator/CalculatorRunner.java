package org.example.javaCode.interpreter.calculator;

public class CalculatorRunner {
    public static void main(String[] args) {
        String expression  = "1+2+3-4";
        Expression evaluator = new Evaluate(expression);
        System.out.println(evaluator.interpret(evaluator));
    }
}
