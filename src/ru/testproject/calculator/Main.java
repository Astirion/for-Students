package ru.testproject.calculator;

public class Main {
    public static void main(String[] args) {
        Calculator owrCalculator = new Calculator();

        ManWithCalculator manWithCalculator = new ManWithCalculator(owrCalculator);

        int result = manWithCalculator.calculateSum(3, 5);
        System.out.println(result);
        //Create branch
    }
}
