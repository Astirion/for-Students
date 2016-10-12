package ru.testproject.calculator;

public class ManWithCalculator {
    private Calculator calculator;

    public ManWithCalculator(Calculator calc) {
        this.calculator = calc;
    }

    public int calculateSum(int a, int b) {
        return calculator.sum(a, b);
    }

    public int calculateSubtraction(int a, int b) {
        return calculator.subtraction(a, b);
    }
    public int clculateMultiplcation(int a, int b) {
        return calculator.multiplication(a, b);
    }
    public int calculateDivision(int a, int b) {
        return calculator.division(a, b);
    }
}
