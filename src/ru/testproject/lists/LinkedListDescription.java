package ru.testproject.lists;

import java.util.LinkedList;

public class LinkedListDescription {
    final static int SIZE_OF_LIST = 1_000_000;

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        System.out.println(linkedList.size());

        long begin = System.currentTimeMillis();

        for (int i = 0; i < SIZE_OF_LIST; i++) {
            linkedList.add("" + i);
        }

        long end = System.currentTimeMillis();

        System.out.println("Врремя выполнения алгоритма:" + (end - begin) + " ms.");

        linkedList.set(4, "18");
        linkedList.add(5, "48");

//        System.out.println(linkedList);
    }
}
