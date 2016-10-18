package ru.testproject.tasks;

/**
 * Created by Stanislav on 12.10.2016.
 */
public class Loop4 {
    public static void main(String[] args) {
        int[] a = new int[26];
        int i;
        for (i = 0; i < a.length; i++)
        {
            if (i < (a.length / 2)){
                a[i] = 1;
            }
            else {
                a[i] = 0;
            }


            System.out.print(a[i]);
        }


    }
}
