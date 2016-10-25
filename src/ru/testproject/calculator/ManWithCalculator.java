package ru.testproject.calculator;

public class ManWithCalculator {
    private Calculator calculator;

    public ManWithCalculator(Calculator calc) {
        this.calculator = calc;
    }

    public double calculateSum(double a, double b) {
        return calculator.sum(a, b);
    }
    public double subtraction(double reducing, double subtrahend) {
        return calculator.subtraction(reducing,subtrahend);}

    public double multiplication(double multiplicand, double multiplier) {
        return calculator.multiplication(multiplicand,multiplier);}

    public double division(double dividend, double divider) {
        return calculator.division(dividend,divider);}
}
