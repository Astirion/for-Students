package ru.testproject.tasks;

/**
 * Created by Jiger on 25.10.2016.
 */
public class Loop6 {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (j < (a.length - i)) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = 0;
                }
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
