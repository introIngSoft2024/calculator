package org.iis.ajnebro;

public class Calculator {
    // Method to add two numbers
    public double add(double number1, double number2) {
        return number1 + number2;
    }  // Method to subtract two numbers

    public double subtract(double number1, double number2) {
        return number1 - number2;
    }

    // Method to multiply two numbers
    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

    // Method to divide two numbers
    public double divide(double number1, double number2) {
        if (number2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero") ;
        }
        return number1 / number2;
    }
}
