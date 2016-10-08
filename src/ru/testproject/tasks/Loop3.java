package ru.testproject.tasks;

/**
 * Created by Андрей on 08.10.2016.
 */
public class Loop3 {
    public static void main(String[] args) {
        int[][] test = new int[10][10];

        showMeMatrix(test);

    }


    public static void showMeMatrix(int[][] a) {
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a[j].length; i++) {
                if (i < (10 - j)) {
                    System.out.print(a[j][i] + " ");
                } else {
                    a[j][i] = 1;
                    System.out.print(a[j][i] + " ");
                }

            }
            System.out.println();
        }
        System.out.println("====================");
    }
}
