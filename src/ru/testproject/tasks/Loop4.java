package ru.testproject.tasks;

/**
 * Created by 1 on 08.10.2016.
 */
public class Loop3 {
    public static void main(String[] args) {
        int a[][] = new int[10][10];

        ShowMeMatrix(a);
    }

    public static void ShowMeMatrix(int[][] a) {
        for (int j = 0; j < a.length; j++)
        {
            for (int i = 0; i < a[j].length; i++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }

        }
}