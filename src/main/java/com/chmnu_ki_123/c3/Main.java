package com.chmnu_ki_123.k3;

public class Main {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        double x = inputHandler.getDouble("Enter the value of x: ");
        double a = inputHandler.getDouble("Enter the value of a: ");
        double b = inputHandler.getDouble("Enter the value of b: ");
        double c = inputHandler.getDouble("Enter the value of c: ");

        Calculator calculator = new Calculator();
        try {
            double result = calculator.calculate(x, a, b, c);
            System.out.printf("Result: %.3f\n", result);
        } catch (ArithmeticException e) {
            System.err.println("Error in calculations: " + e.getMessage());
        }
    }
}
