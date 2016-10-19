package ru.testproject.workwithstring;

import java.util.Scanner;


public class Months {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Какой твой любимый период года?");
        int input = sc.nextInt();

        int result = checkIntVoid(input);

        System.out.println(getResult(result));

    }

    public static int checkIntVoid(int i){

        Scanner sc = new Scanner(System.in);

        while (i<0) {
            if (i<0){
                System.out.println("Нет такого месяца!");
            }
            System.out.println("Какой твой любимый период года?");
            i = sc.nextInt();
        }

        return i;

    }

    public static String getResult(int i){
        String output;

        switch (i) {
            case 1:
            case 2:
            case 12:
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
                output = "нет такого месяца";
                break;

        }

        return output;
    }
}
