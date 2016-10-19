package ru.testproject.workwithstring;

import java.util.Scanner;

/**
 * Created by 1 on 19.10.2016.
 */
public class monthsOfYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите числовое значение месяца");

        int q = sc.nextInt();


        while (q < 0) {

            System.out.println("не хочу");
            System.out.println("Введите числовое значение месяца");
            q = sc.nextInt();
        }
        ShowMeSeason(q);
    }

    public static void ShowMeSeason(int input) {
        String output;
        switch (input) {
            case 12:
            case 1:
            case 2:
                output = "зима";
                break;
            case 3:
            case 4:
            case 5:
                output = "весна";
                break;
            case 6:
            case 7:
            case 8:
                output = "лето";
                break;
            case 9:
            case 10:
            case 11:
                output = "осень";
                break;
            default:
                output = "неверная команда";
                break;
        }

        System.out.println(output);
    }
}

