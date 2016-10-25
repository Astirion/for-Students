package ru.testproject.workwithstring;

import java.util.Scanner;

/**
 * Created by Jiger on 19.10.2016.
 */
public class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите номер месяца: ");

        String month = sc.nextLine();
        String output;

        switch (month) {
            case ("12"):
            case ("1"):
            case ("2"):
                output = "Зима";
                break;
            case ("3"):
            case ("4"):
            case ("5"):
                output = "Весна";
                break;
            case ("6"):
            case ("7"):
            case ("8"):
                output = "Лето";
                break;
            case ("9"):
            case ("10"):
            case ("11"):
                output = "Осень";
                break;
            default:
                output = "Бухабрь";
        }
        System.out.print(output);
    }
}
