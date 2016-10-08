package ru.testproject.tasks;

public class Loop2 {
    public static void main(String[] args) {
        int[][] test = new int[4][10];

        int a[][] = new int[][]{
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {5, 6, 7, 8, 9, 10, 11, 12, 13, 14},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        };


        showMeMatrix(test);
        showMeMatrix(a);
    }

    public static void showMeMassive(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("====================");
    }

    public static void showMeMatrix(int[][] a) {
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a[j].length; i++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println("====================");
    }
}
