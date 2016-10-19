package ru.testproject.workwithstring;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите действие: ");

        int input = sc.nextInt();
        String output;

        switch (input) {
            case 1: output = "Новая игра";
                break;
            case 2: output = "Сохранить игру";
                break;
            case 3: output = "Загрузить игру";
                break;
            case 4: output = "Выход";
                break;
            default: output = "Неверная команда";

        }

        System.out.println(output);
    }
}
