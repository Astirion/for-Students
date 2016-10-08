package ru.testproject.calculator;

public class ManWithCalculator {
    private Calculator calculator;

    public ManWithCalculator(Calculator calc) {
        this.calculator = calc;
    }

    public int calculateSum(int a, int b) {
        return calculator.sum(a, b);
    }
}
