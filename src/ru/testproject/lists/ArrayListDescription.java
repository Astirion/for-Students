package ru.testproject.lists;

import java.util.ArrayList;

public class ArrayListDescription {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(arrayList.size());

        for (int i = 0; i < 10; i++) {
            arrayList.add("" + i);
        }

        arrayList.set(4,"18");
        arrayList.add(5, "48");

        System.out.println(arrayList);
    }
}
