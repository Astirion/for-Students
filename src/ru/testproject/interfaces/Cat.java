package ru.testproject.interfaces;

public class Cat extends Animal implements Movable {
    @Override
    public void move() {
        System.out.println("Cat is walking.");
    }
}
