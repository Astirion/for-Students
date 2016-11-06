package ru.testproject.interfaces;

public class Dolphin extends Animal implements Movable {
    @Override
    public void move() {
        System.out.println("Dolphin is swimming");
    }
}
