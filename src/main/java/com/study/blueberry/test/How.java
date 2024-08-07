package com.study.blueberry.test;

public class How {
    public static void main(String[] args) {
        Dog dog = new Dog("bark");
        Cat cat = new Cat("meow");
        dog.printDog();
        cat.printCat();

        printAnimal printAnimal = new printAnimal(4, 2, true);
        printAnimal.animal();
    }
}

class Animal {
    int leg;
    boolean hasTail;
    int eye;

    Animal(int leg, int eye, boolean hasTail) {
        this.leg = leg;
        this.eye = eye;
        this.hasTail = hasTail;
    }
}

class Dog extends Animal {
    String sound;

    Dog(String sound) {
        super(4, 2, true);
        this.sound = sound;
    }

    void printDog() {
        System.out.println("Dog sound: " + sound);
    }
}

class Cat extends Animal {
    String sound;

    Cat(String sound) {
        super(4, 2, true);
        this.sound = sound;
    }

    void printCat() {
        System.out.println("Cat sound: " + sound);
    }
}

class printAnimal extends Animal {
    printAnimal(int leg, int eye, boolean hasTail) {
        super(leg, eye, hasTail);
    }

    void animal() {
        System.out.println("Legs: " + leg);
        System.out.println("Eyes: " + eye);
        System.out.println("Has tail: " + hasTail);
    }
}
