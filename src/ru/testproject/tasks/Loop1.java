package ru.testproject.tasks;

public class Loop1 {
    public static void main(String[] args) {
        int[] a = new int[10];

        showMeMassive(a);

        for (int i = 0; i < a.length; i++) {
            a[i] = 1;
        }

        showMeMassive(a);
    }

    public static void showMeMassive(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("====================");
    }
}
