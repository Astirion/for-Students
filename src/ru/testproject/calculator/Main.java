package ru.testproject.calculator;

public class Main {
    public static void main(String[] args) {
        Calculator owrCalculator = new Calculator();

        ManWithCalculator manWithCalculator = new ManWithCalculator(owrCalculator);

        int result = manWithCalculator.calculateSum(3, 5);
        System.out.println(result);

        result = manWithCalculator.calculateSubtraction(8, 2);
        System.out.println(result);

        result = manWithCalculator.clculateMultiplcation(4, 83);
        System.out.println(result);

        result = manWithCalculator.calculateDivision(66, 6);
        System.out.println(result);
    }
}
