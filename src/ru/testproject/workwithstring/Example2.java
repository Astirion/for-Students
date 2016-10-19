package ru.testproject.workwithstring;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        char[] massiveOfChars = s.toCharArray();

        int i = 0;

        while (i < massiveOfChars.length) {
            System.out.println(massiveOfChars[i]);
            i++;
        }
    }
}
