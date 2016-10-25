package ru.testproject.calculator;

public class Calculator {

    public double sum(double a, double b) {
        return a + b;
    }

    public double subtraction(double reducing, double subtrahend) {
        double subtraction = reducing - subtrahend;
        return subtraction;
    }

    public double multiplication(double multiplicand, double multiplier) {
        return multiplicand * multiplier;
    }
    public double division (double dividend, double divider){
        return dividend / divider;
    }

}
