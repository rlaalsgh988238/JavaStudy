package com.study.blueberry.test;

interface Weapon {
    int attack();
    int defence();
}

interface Movable {
    void jump();
    void move();
}

public class Callofduty {

    public static void main(String[] args) {

        MyCharacter character1 = new MyCharacter("James", 100, "AK47");

        character1.move();
        character1.jump();
    }
}


class Gun implements Weapon {
    int attackPower;
    int ammunition;

    Gun(int attackPower, int ammunition) {
        this.attackPower = attackPower;
        this.ammunition = ammunition;
    }

    @Override
    public int attack() {
        if (ammunition > 0) {
            System.out.println("Shoot!!");
            ammunition--;
            return attackPower;
        } else {
            System.out.println("Shit!! I must reload!!");
            return 0;
        }
    }

    @Override
    public int defence() {
        return 10;
    }

    public void reload() {
        System.out.println("Reloading...");
        ammunition = 30;
    }
}

class Knife implements Weapon {
    boolean attackReady;
    int waitingTime;

    Knife(boolean attackReady, int waitingTime) {
        this.attackReady = attackReady;
        this.waitingTime = waitingTime;
    }

    @Override
    public int attack() {
        if (attackReady) {
            System.out.println("Slash!!");
            return 10;
        } else {
            System.out.println("Waiting for the right moment...");
            return 0;
        }
    }

    @Override
    public int defence() {

        return 5;
    }
}

class MyCharacter implements Movable {
    int hp;
    String name;
    String gunType;

    MyCharacter(String name, int hp, String gunType) {
        this.name = name;
        this.hp = hp;
        this.gunType = gunType;
    }

    @Override
    public void move() {
        System.out.println(name + " is moving.");
    }

    @Override
    public void jump() {
        System.out.println(name + " jumps.");
    }
}