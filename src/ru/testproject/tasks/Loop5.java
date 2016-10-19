package ru.testproject.tasks;

/**
 * Created by Jiger on 15.10.2016.
 */
public class Loop5 {

    public static void main(String[] args) {
        int[][] a = new int[10][10];
        for (int i = 0; i < a.length; i++){
        for (int j = 0; j < a.length; j++) {
            if (j < (a.length - i)){
                a[i][j] = 1;
            }

            else{
                a[i][j] = 0;
            }
            System.out.print(a[i][j]);
        }
            System.out.println();
        }
System.out.println("==========");

        int[][] b = new int[10][10];
        for (int k = 0; k > (b.length - b.length - 1); k--){
            for (int f = 0; f < b.length; f++) {
                if (k < (b.length - f)){
                    b[k][f] = 1;
                }

                else{
                    b[k][f] = 0;
                }
                System.out.print(b[k][f]);
            }
            System.out.println();
        }
        System.out.println("==========");

        int[][] c = new int[10][10];
        for (int q = 0; q < c.length; q++){
            for (int w = 9; w > (c.length - c.length - 1); w--) {
                if (q < (c.length - w)){
                    c[q][w] = 1;
                }

                else{
                    c[q][w] = 0;
                }
                System.out.print(c[q][w]);
            }
            System.out.println();
        }
        System.out.println("==========");

        int[][] d = new int[10][10];
        for (int e = 9; e > (d.length - d.length -1); e--){
            for (int r = 9; r > (d.length - d.length -1); r--) {
                if (e < (d.length - r)){
                    d[e][r] = 1;
                }

                else{
                    d[e][r] = 0;
                }
                System.out.print(d[e][r]);
            }
            System.out.println();
        }

    }

}
