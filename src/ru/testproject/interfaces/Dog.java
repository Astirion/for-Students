package ru.testproject.interfaces;

public class Dog extends Animal implements Movable {
    @Override
    public void move() {
        System.out.println("Dog is running!");
    }
}
