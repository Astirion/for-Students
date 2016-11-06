package ru.testproject.interfaces;

public class Main {
    public static void main(String[] args) {
        Movable[] animals = new Movable[3];

        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Dolphin();

        for (int i = 0; i < animals.length; i++) {
            animals[i].move();
        }
    }
}
