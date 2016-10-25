package ru.testproject.calculator;

public class Main {
    public static void main(String[] args) {
        Calculator owrCalculator = new Calculator();

        ManWithCalculator manWithCalculator = new ManWithCalculator(owrCalculator);

        double result = manWithCalculator.calculateSum(3, 5.6);
        System.out.println(result);

        double subtraction = manWithCalculator.subtraction(4, 6.8);
        System.out.println(subtraction);

        double multiplication = manWithCalculator.multiplication(2.3, 5);
        System.out.println(multiplication);

        double division = manWithCalculator.division(10, -3);
        System.out.println(division);
    }
}
