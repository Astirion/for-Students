package ru.testproject.calculator;

public class ManWithCalculator {
    private Calculator calculator;

    public ManWithCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public int calculateSum(int a, int b) {
        return calculator.sum(a, b);
    }
}
