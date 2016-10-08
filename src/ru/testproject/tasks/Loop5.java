package ru.testproject.tasks;

/**
 * Created by 1 on 08.10.2016.
 */
public class Loop4 {
    public static void main(String[] args) {
        int a[][] = new int[10][10];

        int m = 0;


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {

                if (i > j) {
                    m = 1;
                } else {
                    m = 0;
                }
                a[i][j] = m;

            }
        }
        ShowMeMatrix(a);
        System.out.println("=========================");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {

                if (i < 10 - j) {
                    m = 1;
                } else {
                    m = 0;
                }
                a[i][j] = m;

            }

        }
        ShowMeMatrix(a);
        System.out.println("=========================");

            }

    public static void ShowMeMatrix(int[][] a) {
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a[j].length; i++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }

    }
}