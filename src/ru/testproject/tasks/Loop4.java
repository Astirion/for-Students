package ru.testproject.tasks;

import java.io.BufferedReader;

/**
 * Created by Андрей on 08.10.2016.
 */
public class Loop4 {
    public static void main(String[] args) {
        int b = 5;
        int [][] a = new int[b][b];

        showMestar(a);
    }

    public static void showMestar(int[][] a){
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a[j].length; i++) {
                int d = a[j].length;
                if (i+j < (d-1)-j && i+j<(d-1)-(i+j)) {
                    System.out.print(a[j][i] + " ");
                } else if (i+j < (d-1)-j && i+j>(d)-(i+j)){
                    System.out.print(a[j][i] + " ");
//                } else if ((i+j)>(d-j)){
//                    System.out.print(a[j][i] + " ");
//                } else if (d==(j+1) &&(d-i)==d){
//                    System.out.print(a[j][i] + " ");
                } else {

                    System.out.print(a[j][i] + 1 + " ");
                }
//                if ((d-j)==d &&(d-i)==d || (j+i)<((d-1)-(i+j))){
//                    System.out.print(a[j][i] + " ");
//                } else if (d==(j+1) && d==(i+1)){
//                    System.out.print(a[j][i] + " ");
//                } else if ((d-j)==d && d==(i+1)){
//                    System.out.print(a[j][i] + " ");
//                } else if (d==(j+1) &&(d-i)==d){
//                    System.out.print(a[j][i] + " ");
//                } else {
//                    System.out.print(a[j][i] + 1 + " ");
//                }
//                if (j==i){
//                    System.out.print(a[j][i] + " ");
//                }else {
//
//                }


            }
            System.out.println();
        }
        System.out.println("====================");

    }
}
